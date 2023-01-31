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
public class Person {
    protected String firstName;
    protected String lastName;
    protected String initial;
    
//    Person (String lastName, String firstName, String initial) {
//        this.firstName = firstName; 
//        this.lastName = lastName;
//        this.initial = initial;
//    }
    
    // set Methods
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    
    public void setInitial (String initial) {
        this.initial = initial;
    }
    
    // get Methods
    public String getFirstName () {
        return firstName;
    }
    
    public String getLastName () {
        return lastName;
    }
    
    public String getInitial () {
        return initial;
    }
    
    public String getFullName () {
        return firstName + lastName;
    }
}
