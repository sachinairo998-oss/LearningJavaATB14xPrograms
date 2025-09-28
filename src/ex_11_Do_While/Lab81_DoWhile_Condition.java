package ex_11_Do_While;

public class Lab81_DoWhile_Condition {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println(a);
        } while (a < 0);
        a++; // print 0 as o/p since print present above condition then stops as condition fail


        while (a < 0) {
            System.out.println(a);
            a++; // no output as condition fail
        }
    }
}
