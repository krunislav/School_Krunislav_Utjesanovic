/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Kruno
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    public Student(){
        this.firstName = "Krunislav";
        this.lastName = "Utješanović";
        this.yearOfBirth = 1979;
    }
    
    public Student(String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void setFirstName(String setCustomFirstName){
        this.firstName = setCustomFirstName;
    }
    
    
    public void setLastName(String setCustomLastName){
        this.lastName = setCustomLastName;
    }
    
    
    public void setYearOfBirth(int setCustomYearOfBirth){
        this.yearOfBirth = setCustomYearOfBirth;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
    
    public void info(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println();
    }
    
}   
