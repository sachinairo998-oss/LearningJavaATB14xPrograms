package ex_05_Ternary_Operator;

public class Lab38_Even_Odd {
    public static void main(String[] args) {
        int no = 5;
        String no1 = (no % 5 == 0) ? "Odd" : "Even";
        System.out.println(no1);
    }
}
