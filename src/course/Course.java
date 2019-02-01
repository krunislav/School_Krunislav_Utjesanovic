package course;

/**
 *
 * @author Kruno
 */
public class Course {

    private String name;
    private int numberOfClasses;
    private String codeName;

    public void setName(String setCustomName) {
        this.name = setCustomName;
    }

    public void setNumberOfClasses(int setCustomNumberOfClasses) {
        this.numberOfClasses = setCustomNumberOfClasses;
    }

    public void setCodeName(String setCustomCodeName) {
        this.codeName = setCustomCodeName;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public Course() {
        this.name = "QA";
        this.numberOfClasses = 100;
        this.codeName = "qa-1";
    }

    public Course(String name, int numberOfClasses, String codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }

    public void info() {
        System.out.println("Course name: " + this.name);
        System.out.println("Number of classes: " + this.numberOfClasses);
        System.out.println("Code name: " + this.codeName);
        System.out.println();
    }

}
