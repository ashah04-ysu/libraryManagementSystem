/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library2;

//import java.util.Scanner;

/**
 *
 * @author Anh Vu Truong Nguyen
 */
public class User extends Person {
    private String userName;
    private String password;
    private Role role;
    
    public User () {
        this.userName = " ";
        this.password = " ";
        this.firstName = " ";
        this.lastName = " ";
        this.initial = " ";
        this.role = Role.GUEST;
    }
// Constructor
    public User (String userName, String password, String firstName,
            String lastName, String initial, Role role) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial = initial;
        this.role = Role.GUEST;
    }
    
    // set methods
    public void setUserName (String userName) {
        this.userName = userName;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    public void setRole (Role role) {
        this.role = role;
    }
    
    //get methods
    public String getUserName () {
        return userName;
    }
    
    public String getPassword () {
        return password;
    }
    
    public Role getRole () {
        return role;
    }
}
