import java.util.Arrays;
import java.util.Scanner;

public class Course {
    private int[] students;
    private String courseName;

    
    public void setStudents(int[] students) {
        this.students = students;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private boolean isOnline;
    private String termInCourse;

    public Course(String courseName, boolean isOnline, String termInCourse) {
        this.courseName = courseName;
        this.isOnline = isOnline;
        this.termInCourse = termInCourse;
    }

    public int[] getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public String getTermInCourse() {
        return termInCourse;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public void setTermInCourse(String termInCourse) {
        this.termInCourse = termInCourse;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        System.out.print("Is the course online (true/false): ");
        boolean isOnline = scanner.nextBoolean();
        scanner.nextLine(); 

        System.out.print("Enter the term: ");
        String term = scanner.nextLine();

        Course course = new Course(courseName, isOnline, term);

        // Test getters
        System.out.println("Course Details:");
        System.out.println("Name: " + course.getCourseName());
        System.out.println("Online: " + course.isOnline());
        System.out.println("Term: " + course.getTermInCourse());

        // Test setStudents and getStudents
        System.out.print("Enter student numbers: ");
        String studentInput = scanner.nextLine();
        String[] studentNumbers = studentInput.split(",");
        int[] studentArray = new int[studentNumbers.length];

        for (int i = 0; i < studentNumbers.length; i++) {
            studentArray[i] = Integer.parseInt(studentNumbers[i].trim());
        }

        course.setStudents(studentArray);

        System.out.println("Student numbers in course: " + Arrays.toString(course.getStudents()));

        scanner.close();
    }

}
