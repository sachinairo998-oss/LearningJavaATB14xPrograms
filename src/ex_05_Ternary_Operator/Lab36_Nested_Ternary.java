package ex_05_Ternary_Operator;

public class Lab36_Nested_Ternary {
    public static void main(String[] args) {
        int age = 25;
        String age1 = (age > 18) ? (age > 25 ? "Drink" : "No") : "Yes";
//        age1 = Condition ? Expression 1 (Condition2 ? Exp3 : Exp4);
        System.out.println(age1);
    }
}
