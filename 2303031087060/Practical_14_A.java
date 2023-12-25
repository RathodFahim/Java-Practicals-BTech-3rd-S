class Student {
    private String studentName;
    private int studentAge;

    // Constructor
    public Student(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}

public class Practical_14_A {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("Sai", 23);

        // Displaying information using encapsulation
        System.out.println("name: " + student.getStudentName());
        System.out.println("age: " + student.getStudentAge());

        // Updating information using encapsulation
        student.setStudentName("New Sai");
        student.setStudentAge(25);

        // Displaying updated information using encapsulation
        System.out.println("studentname: " + student.getStudentName());
        System.out.println("studentage: " + student.getStudentAge());
    }
}
