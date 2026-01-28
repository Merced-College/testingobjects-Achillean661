/*
Ryan Lee & Ian Hanner
1-27-26
LAB: Testing Objects
*/

public class CourseTest {
    public static void main(String[] args) {
        // Courses we are/not taking.
        Course c1 = new Course("CS",4, true);
        Course c2 = new Course("Physics",4, false);
        Course c3 = new Course("English",3, true);

        // EXAMPLE 1:

        // Uses getName to retrieve name from c2 object.
        String printTest = c2.getName();

        // Prints out the name of c2 object.
        System.out.println("c2 course name: " + c2.getName()); // Expected: Physics.
        System.out.println("c2 course name (using printTest variable): " + printTest); // Expected: Physics.

        // EXAMPLE 2:

        // Changes takingCourse from true to false using setTakingCourse.
        c3.setTakingCourse(false);
        System.out.println("\nChanging c3 taking course from true to false: " + c3.getTakingCourse()); // Expected: false.

        // EXAMPLE 3:

        System.out.println("\nc1 course information: ");

        // Prints out the entirety of the c1 object class using toString method.
        System.out.println(c1.toString()); // Expected: Course: CS | Credits: 4 | Taking Course true.

        // We can also just use the class name to print it out directly, saving typing time.
        System.out.println(c1); // Expected: Course: CS | Credits: 4 | Taking Course true.

    }
}
