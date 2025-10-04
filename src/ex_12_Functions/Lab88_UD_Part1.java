package ex_12_Functions;

public class Lab88_UD_Part1 {
    public static void main(String[] args) {
/*        User Defined Functions
        Without Parameters and Return type
        Without Parameters but With Return type
        With Parameters but Without Return type
        With Parameters and Return type*/
        wop_wor_greet ();
        wop_wr_greet ();
        greet_with_details ("Sachin", 28, 35000);
        int sum = sum_of_3_nos (30, 60, 90);
        System.out.println(sum);

    }
    static void wop_wor_greet () {
        System.out.println("No Parameter and Dataytpe");
    }
    static String wop_wr_greet () {
        System.out.println("No Parameter but Yes Return type");
        return "Sachin";
    }
    static void greet_with_details (String name, int age, double salary) {
        System.out.println("Your Name -> " + name + ", Your Age -> " + age + ", Your Salary -> " + salary);
    }
    static int sum_of_3_nos (int a, int b, int c) {
        return a+b+c;
    }

}
