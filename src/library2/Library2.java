/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anh Vu Truong Nguyen
 */
public class Library2 {

    /**
     * @param args the command line arguments
     */
    static List<User> User = new ArrayList<User>();
    static List<Books> Books = new ArrayList<Books>();
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        createBook ();
        createUser ();
        
        int position;
        int length = User.size();
        
        String userNameArray [] = new String [length];
        String bookNameArray [] = new String [length];
        for (int i = 0; i < length; i++) {
            userNameArray[i] = (User.get(i)).getUserName();
        }
        for (int i = 0; i < length; i++) {
            bookNameArray[i] = (User.get(i)).getUserName();
        }
        
        System.out.println ("Please login ");
        System.out.print("Please enter your user name ");
        String userName = input.nextLine();
        
        
        position = search (userName, length, userNameArray);
        
        if (position == -1) {
            do {
                System.out.print ("The user name is not correct ");
                userName = input.nextLine();
                position = search (userName, length, userNameArray);
            }
            while (position == -1);
        }
        
        System.out.print("Please enter your password ");
        String password = input.nextLine();
        
        if (!password.equals(User.get(position).getPassword())) {
            while (!password.equals((User.get(position)).getPassword())) {
                System.out.print ("The password is not correct ");
                password = input.nextLine();
            }
        }
        
        if (null != (User.get(position)).getRole()) switch ((User.get(position)).getRole()) {
            case ADMIN:
                System.out.print ("What to do ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1: createNewUser(); break;
                    case 2: createBook (); break;
                    case 3: removeBook(bookNameArray); break;
                    case 4: removeUser(userNameArray); break;
                }
                break;
            case LIBRARIAN:
                System.out.print ("What to do ");
                int choice1 = input.nextInt();
                
                switch (choice1) {
                    case 1: createBook (); break;
                    case 2: removeBook(bookNameArray); break;
                }
                break;
            case GUEST:
                searchBook ();
                break;
            default:
                break;
        }
    }
    
    public static void createBook () {
        User user1 = new User ("vntruong", "123456", "Vu", "Truong", "VT", Role.GUEST);
        User user2 = new User ("mjohnson", "13579", "Mary", "Johnson", "MS", Role.GUEST);
        User user3 = new User ("mwilliams", "132435", "Mark", "Williams", "MW", Role.GUEST);
        User user4 = new User ("dhauer", "24354657", "Daniel", "Hauer", "DH", Role.GUEST);
        User user5 = new User ("mmccormick", "35465768", "Mike", "McCormick", "MM", Role.GUEST);
        User user6 = new User ("mbryan", "1324", "Mike", "Bryan", "MB", Role.LIBRARIAN);
        User user7 = new User ("jsock", "3546", "Jack", "Sock", "MM", Role.LIBRARIAN);
        User user8 = new User ("rfederer", "4657", "Roger", "Federer", "RF", Role.ADMIN);
        
        User.add(user1);
        User.add(user2);
        User.add(user3);
        User.add(user4);
        User.add(user5);
        User.add(user6);
        User.add(user7);
        User.add(user8);
    }
    
    public static void createUser () {
        Books book1 = new Books ("Mike", "Computer Science", "Introduction to C++", "9/13/2018", "Tony Gaddis", "CPP1324");
        Books book2 = new Books ("Jack", "Computer Science", "All about Java", "10/13/2018", "Tony Gaddis", "JAVA1913");
        Books book3 = new Books ("John", "English", "Writing Technique", "12/13/2018", "Joe Book", "ENGL4545");
        Books book4 = new Books ("Matthew", "Math", "Calculus", "4/12/2018", "Science Books", "MATH1415");
        Books book5 = new Books ("Jones", "Math", "Linear Algebra", "5/16/2018", "Science Books", "LINE4647");
        
        Books.add(book1);
        Books.add(book2);
        Books.add(book3);
        Books.add(book4);
        Books.add(book5);
    }
    
    public static int search (String string, int length, String [] array) {
        int position = -1;
        int i = 0;
        boolean found = false;
        
        while (i < length && !found) {
            if (array[i].equals(string)) {
                found = true;
                position = i;
            }
            i++;
        }
        
        return position;
    }
    
    public static void searchBook () {
        int length = 5;
        System.out.print ("Enter the name of the book that you are looking for ");
        String name = input.nextLine();
        int position; 
        
        String titleArray [] = new String [5];
        
        for (int i = 0; i < length; i++) {
            titleArray[i] = (Books.get(i)).getTitle(); 
        }
        
        position = search (name, length, titleArray);
        
        if (position == -1) {
            while (position == -1) {
                System.out.print ("The name of the book that you are looking for is not found ");
                name = input.nextLine();
                position = search (name, length, titleArray);
            }
        }
        
        System.out.println ("Here is the detail of the book that you are looking for ");
        System.out.println("Title: " + (Books.get(position)).getTitle());
        System.out.println("Author: " + (Books.get(position)).getAuthor());
        System.out.println("Publiser: " + (Books.get(position)).getPublisher());
        System.out.println("Publish Date " + (Books.get(position)).getPublishDate());
        System.out.println("Subject: " + (Books.get(position)).getSubject());
        System.out.println("ID: " + (Books.get(position)).getID());
    }
    
    public static void addNewBook () {
        System.out.print ("Enter the title of the book ");
        String title = input.nextLine();
        System.out.print ("Enter the author of the book ");
        String author = input.nextLine();
        System.out.print ("Enter the publisher of the book ");
        String publisher = input.nextLine();
        System.out.print ("Enter the publish date of the book ");
        String publishDate = input.nextLine();
        System.out.print ("Enter the subject of the book ");
        String subject = input.nextLine();
        System.out.print ("Enter the ID of the book ");
        String ID = input.nextLine();
        
        Books newBook = new Books(author, subject, title, publisher, publishDate, ID);
        Books.add(newBook);
    }
    
    public static void createNewUser () {
        System.out.print ("Enter the first name of the new user ");
        String firstName = input.nextLine();
        System.out.print ("Enter the last name of the new user ");
        String lastName = input.nextLine();
        System.out.print ("Enter the initial of the new user ");
        String initial = input.nextLine();
        System.out.print ("Enter the username of the new user ");
        String userName = input.nextLine();
        System.out.print ("Enter the password of the new user ");
        String password = input.nextLine();
        System.out.println ("Choose the role for this uer ");
        int choice = input.nextInt();
        
        Role role = Role.GUEST;
        
        switch (choice) {
            case 1:
                role = Role.ADMIN;
                break;
            case 2:
                role = Role.GUEST;
                break;
            case 3:
                role = Role.LIBRARIAN;
                break;
            default:
                break;
        }
        
        User newUser = new User (userName, password, firstName,
                                lastName, initial, role);
        
        User.add(newUser);
    }
    
    public static void removeBook (String [] array) {
        System.out.print("Enter the name of the book to remove ");
        String name = input.nextLine();
        int length = Books.size();
        
        int position = search (name, length, array);
        
        if (position == -1) {
            while (position == -1) {
                System.out.print ("The name of the book is not found ");
                name = input.nextLine();
                position = search (name, length, array);
            }
        }
        
        Books.remove(position);
    }
    
    public static void removeUser (String [] array) {
        System.out.print("Enter the username of the user to remove ");
        String userName = input.nextLine ();
        int length = Books.size();
        
        int position = search (userName, length, array);
        
        if (position == -1) {
            while (position == -1) {
                System.out.print ("The username is not found ");
                userName = input.nextLine();
                position = search (userName, length, array);
            }
        }
        
        User.remove(position);
    }
}
