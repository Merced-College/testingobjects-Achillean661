/*
Ryan Lee & Ian Hanner
1-27-26
LAB: Testing Objects
*/

public class Course {

    // Variables to store information on the course.
    private String name;
    private int credits;
    private boolean takingCourse;

    // Default Constructor for no parameters or information in creating our object.
    public Course() {
        name = "Unknown";
        credits = 0;
        takingCourse = false;
    }

    // Parameterized Constructor to allow information input on the course when creating object.
    public Course(String name, int credits, boolean takingCourse) {
        this.name = name;
        this.credits = credits;
        this.takingCourse = takingCourse;
    }

    /*
    Getters allow us to retrieve specific information regarding the course from
    the respective object when printing it out or storing it as a variable in CourseTest.
    Refer to c2 in CourseTest as example.
     */

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public boolean getTakingCourse() {
        return takingCourse;
    }

    /*
    Setters allow us to directly modify information within the object and class without
    needing to use public variables in Course. Refer to c3 in CourseTest as example.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        if (credits > 0) this.credits = credits;
    }

    public void setTakingCourse(boolean takingCourse) {
        this.takingCourse = takingCourse;
    }

    /* toString allows us to print out the information in our class concisely without needing to write manual
    print lines every time. We can simply input the object in the print line and retrieve the information.
    Refer to c1 in CourseTest as example.
     */
    @Override
    public String toString() {
        return "Course: " + name + " | Credits: " + credits + " | Taking Course: " + takingCourse;
    }
}

