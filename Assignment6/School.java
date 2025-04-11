
import java.util.Random;

public class School {
    private Student[] students;
    private Course[] courses;
    private static int curStudents = 0;
    private static int curCourses = 0;

    public School(Student[] students, Course[] courses) {
        this.students = students;
        this.courses = courses;

    }
public void addStudent(Student student){
    if (curStudents < students.length){
        students[curStudents] = student;
        curStudents++;
   }
}
public void addCourse(Course course){
    if (curCourses < courses.length){
         courses[curCourses] = course;
         curCourses++;
    }
}
public Course getCourseByName(String corName){
        if(courses.length == 0 || curCourses == 0)
            return null;
        for (int idx = 0; idx < curCourses; idx++) {
            if(courses[idx] !=null && courses[idx].getCourseName().equals(corName)){
                return  courses[idx];
            }
        }
    return null;
}

public void printStudentsAndGrades(Course course) {

    int[] studentNums = course.getStudents();
    // if (studentNums == null) {
    //     return;
    // }
    for (int studentNum : studentNums) {
        for (int i = 0; i < curStudents; i++) {
            if (students[i].getStudentNum() == studentNum) {
                System.out.println(students[i].toString());
                break;
            }
        }
    }
    System.out.println();
}

private double calculateAverage(Course course) {
    if (course == null) {
        return 0.0;
    }
    int[] studentNums = course.getStudents();
    if (studentNums == null) {
        return 0.0;
    }

    double totalGrades = 0.0;
    int count = 0;
    double result;

    for (int studentNum : studentNums) {
        for (int i = 0; i < curStudents; i++) {
            if (students[i].getStudentNum() == studentNum) {
                totalGrades += students[i].getNumberGrade();
                count++;
                break;
            }
        }
    }
    result = totalGrades / count;
    return result;
}

public void printAverages() {
    for (int i = 0; i < curCourses; i++) {
        System.out.println("The average of " + courses[i].getCourseName() + " is " + calculateAverage(courses[i]));
    }
}



    // your code goes here
    public static void main(String[] args) throws Exception {
        String[] names = { "Bobby", "Sally", "Eve", "Abdul", "Luis", "Sadiq", "Diego", "Andrea", "Nikolai",
                "Gabriela" };
        int[] studentNums = new int[10];
        Random rn = new Random();
        School school = new School(new Student[10], new Course[2]);
        for (int i = 0; i < 10; i++) {
            int studentNum = rn.nextInt(100000);
            Student s = new Student(names[i], studentNum, i * 10);
            studentNums[i] = studentNum;
            school.addStudent(s);
        }
        Course cst = new Course("CST8116", true, "Spring");
        Course basket = new Course("Basket Weaving", false, "Fall");
        cst.setStudents(studentNums);
        basket.setStudents(studentNums);
        school.addCourse(cst);
        school.addCourse(basket);
        school.printStudentsAndGrades(school.getCourseByName("CST8116"));
        school.printStudentsAndGrades(school.getCourseByName("Basket Weaving"));

        school.printAverages();
    }
}
