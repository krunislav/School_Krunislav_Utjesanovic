/**
 *
 * @author Kruno
 */
package main;

import student.Student;
import course.Course;
import computer.Computer;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Instance of class Student;
         */
        Student student = new Student();
//        Course course = new Course();
//        Computer computer = new Computer();

//        student.setCourse(course);
        student.info();

        student.setFirstName("Marko");
        student.setLastName("Marković");
        student.setYearOfBirth(1990);
        student.getCourse().setName("JAVA");
        student.getCourse().setNumberOfClasses(105);
        student.getComputer().setProcessTact(2.4);
        student.getComputer().setMemory(8.0);
        student.getComputer().setHardDrive(320);

        student.info();

//        Student studentSecondConstructor = new Student("Mladen", "Mladenović", 1980);
//        studentSecondConstructor.info();
//
//        studentSecondConstructor.setFirstName("Stevan");
//        studentSecondConstructor.setLastName("Stevanović");
//        studentSecondConstructor.setYearOfBirth(1985);
//        studentSecondConstructor.info();
        /**
         * Instance of class Course
         */
//        System.out.println("Class Course");
//        System.out.println();
//        course.info();
//        Course courseSecondConstructor = new Course("JAVA", 150, "JAVA-2");
//        courseSecondConstructor.info();
//
//        courseSecondConstructor.setName("PHP");
//        courseSecondConstructor.setNumberOfClasses(150);
//        courseSecondConstructor.setCodeName("PHP-3");
//        courseSecondConstructor.info();
//
//        System.out.println("Class Computer");
//        System.out.println();
//        computer.info();
//        Computer computerSecondConstructor = new Computer("Windows", 2.4, 8, 1000);
//        computerSecondConstructor.info();
//        computer.setOperatingSystem("MAC OS");
//        computer.setProcessTact(2.4);
//        computer.setMemory(8.0);
//        computer.setHardDrive(1000);
//        computer.info();
//        student.setCourse(course);
        //sve je dostupno
//        student.getCourse().info();
//        student.setComputer(computer);
//        student.getComputer().info();
    }

}
