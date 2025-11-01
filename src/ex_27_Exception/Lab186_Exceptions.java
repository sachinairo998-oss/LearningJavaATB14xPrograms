package ex_27_Exception;

public class Lab186_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the Program");

        String ip = args[0]; // no i/p - ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // i/p - String then java.lang.NumberFormatException
        int b = 10/a; // i/p - 0 then ArithmeticException
        System.out.println(b);

        System.out.println("End the program");
    }
}
