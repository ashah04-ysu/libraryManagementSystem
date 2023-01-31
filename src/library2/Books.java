/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library2;

/**
 *
 * @author Anh Vu Truong Nguyen
 */
public class Books {
    private String author;
    private String subject;
    private String title;
    private String pubishDate;
    private String publisher;
    private String ID;
    
    // Default Constructor
    Books () {
        this.author = " ";
        this.pubishDate = " ";
        this.publisher = " ";
        this.title = " ";
        this.subject = " ";
        this.ID = " ";
    }
    // Constructor
    Books (String author, String subject, String title, String publishDate, String publisher, String ID) {
        this.author = author;
        this.pubishDate = publishDate;
        this.publisher = publisher;
        this.title = title;
        this.subject = subject;
        this.ID = ID;
    }
    
    // set methods
    void setAuthor (String author) {
        this.author = author;
    }
    
    void setSubject (String subject) {
        this.subject = subject;
    }
    
    void setTitle (String title) {
        this.title = title;
    }
    
    void setPublishDate (String publishDate) {
        this.pubishDate = publishDate;
    }
    
    void setPublisher (String publisher) {
        this.publisher = publisher;
    }
    
    void setID (String ID) {
        this.ID = ID;
    }
    
    // get Methods
    String getAuthor () {
        return author;
    }
    
    String getSubject () {
        return subject;
    }
    
    String getTitle () {
        return title;
    }
    
    String getPublishDate () {
        return pubishDate;
    }
    
    String getPublisher () {
        return publisher;
    }
    
    String getID () {
        return ID;
    }
}
