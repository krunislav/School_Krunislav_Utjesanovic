/**
 *
 * @author Kruno
 */
package main;

import student.Student;
import course.Course;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Instance of class Student;
         */
        Student student = new Student();
        student.info();

        Student studentSecondConstructor = new Student("Mladen", "Mladenović", 1980);
        studentSecondConstructor.info();

        studentSecondConstructor.setFirstName("Stevan");
        studentSecondConstructor.setLastName("Stevanović");
        studentSecondConstructor.setYearOfBirth(1985);
        studentSecondConstructor.info();

        /**
         * Instance of class Course
         */
        System.out.println("Class Course");
        System.out.println();

        Course course = new Course();
        course.info();

        Course courseSecondConstructor = new Course("JAVA", 150, "JAVA-2");
        courseSecondConstructor.info();

        courseSecondConstructor.setName("PHP");
        courseSecondConstructor.setNumberOfClasses(150);
        courseSecondConstructor.setCodeName("PHP-3");
        courseSecondConstructor.info();

    }

}
