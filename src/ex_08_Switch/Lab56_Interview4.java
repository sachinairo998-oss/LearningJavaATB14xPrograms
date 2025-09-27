package ex_08_Switch;

public class Lab56_Interview4 {
    public static void main(String[] args) {
        int a = 100;
        switch (101) { // mentioned switch value case will be considered for o/p
            case 101 -> System.out.println("Yes");
            default -> System.out.println("No");
        }
    }
}
