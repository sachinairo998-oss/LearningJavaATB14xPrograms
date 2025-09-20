package ex_05_Ternary_Operator;

public class Lab40_Age {
    public static void main(String[] args) {
        int age = 59;
        String age1 = (age < 18) ? (age > 25 ? "Adult" : "Minor") : (age < 60 ? "Sr Senior" : "Adult");
        System.out.println(age1);
    }
}
