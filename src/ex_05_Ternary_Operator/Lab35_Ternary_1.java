package ex_05_Ternary_Operator; // condition

public class Lab35_Ternary_1 {
    public static void main(String[] args) {
        int age = 18;
        String Sachin = (age > 18) ? "Yes" : "No";
        System.out.println(Sachin);

        int no = 1000;
        String no1 = (no > 0) ? "+ve" : "-ve";
        /*no > 0 condition then +ve or -ve
        if (no > 0) {}
        else {}*/
        System.out.println(no1);
    }
}
