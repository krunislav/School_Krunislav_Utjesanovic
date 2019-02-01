
/**
 *
 * @author Kruno
 */
package main;
import student.Student;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student student = new Student();
        student.info();
        
        Student studentSecondConstructor = new Student("Mladen", "Mladenović", 1980);
        studentSecondConstructor.info();
        
        studentSecondConstructor.setFirstName("Stevan");
        studentSecondConstructor.setLastName("Stevanović");
        studentSecondConstructor.setYearOfBirth(1985);
        studentSecondConstructor.info();
        
        // TODO code application logic here
    }
    
}
