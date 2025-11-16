package Task.Nov16;

class Student {
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
}

public class Lab220_Student_Management_System {
    public static void main(String[] args) {
        Student s = new Student("Bob", 101, "A");

        System.out.println("Student: " + s.name + ", Roll No: " + s.rollNo + ", Section: " + s.section);

    }
}
