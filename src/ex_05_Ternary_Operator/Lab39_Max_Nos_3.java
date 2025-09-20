package ex_05_Ternary_Operator;

public class Lab39_Max_Nos_3 {
    public static void main(String[] args) {
        int n1 = 2; int n2 = 9;  int n3 = -11;
        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(max);
    }
}
