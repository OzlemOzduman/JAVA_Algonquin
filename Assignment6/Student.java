public class Student {
    private String name;
    private int studentNum;
    private int numberGrade;

    public Student(String name,int studentNum, int numberGrade) {
        this.name = name;
        this.numberGrade = numberGrade;
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getNumberGrade() {
        return numberGrade;
    }

    public void setNumberGrade(int numberGrade) {
        this.numberGrade = numberGrade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name);
        sb.append(" StudentNum: ").append(studentNum);
        sb.append(" Grade=").append(numberGrade);
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example usage and testing
        Student st1 = new Student("Ozlem", 41064256, 90);
        Student st2 = new Student("Ayshe", 6789001, 85);

        System.out.println(st1.toString());
        System.out.println(st2.toString());

        System.out.println("Student 1 Name: " + st1.getName());
        System.out.println("Student 2 Grade: " + st2.getNumberGrade());
    }

   

}
