package ex_23_Static;

public class Lab177_Static {
}

class ATB{
    int phone;
    String name;

    static String course_name = "ATB";

    static void MarkAttendance(){
        System.out.println("Mark Attendance");
      //  System.out.println(this.phone);
    }
    void display(){
        System.out.println(this.phone + this.name + course_name);
    }


}
