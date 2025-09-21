package ex_05_Ternary_Operator;

public class Lab40_Age {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

     // i/p - String o/p - Int
       int age = Integer.parseInt(user_input);
        String result = (age < 18) ? "Minor" : (age < 60 ? "Sr Senior" : "Adult");
        System.out.println(result);
    }
}
