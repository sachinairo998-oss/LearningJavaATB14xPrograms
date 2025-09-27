package ex_07_If_Condition;

public class Lab43_If {
    public static void main(String[] args) {
       String user_input = args[0]; //45 configured value in More Run/Debug option > Apply
        System.out.println(user_input);
        int age = Integer.parseInt(user_input); // Integer.parseInt converts String to Integer
        System.out.println(age);
        if (age > 18);
        System.out.println("You can Vote!");
    }
}
