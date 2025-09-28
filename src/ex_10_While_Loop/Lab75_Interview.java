package ex_10_While_Loop;

public class Lab75_Interview {
    public static void main(String[] args) {
        int i = 0;
        while (i > 0) { // Condition fail so no o/p
            System.out.println("Enter");
            System.out.println(i); // exit code 0
            i++;
        }
        while (i < 0) { // Condition fail so no o/p
            System.out.println(i); // exit code 0
            i++;
        }
    }
}
