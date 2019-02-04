/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import course.Course;
import computer.Computer;

/**
 *
 * @author Kruno
 */
public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;

    private Course course;
    private Computer computer;

    public Student() {
        this.firstName = "Krunislav";
        this.lastName = "Utješanović";
        this.yearOfBirth = 1979;
    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String setCustomFirstName) {
        this.firstName = setCustomFirstName;
    }

    public void setLastName(String setCustomLastName) {
        this.lastName = setCustomLastName;
    }

    public void setYearOfBirth(int setCustomYearOfBirth) {
        this.yearOfBirth = setCustomYearOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void info() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println();
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return this.computer;
    }

}
