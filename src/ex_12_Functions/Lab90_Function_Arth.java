package ex_12_Functions;

import java.util.Scanner;

public class Lab90_Function_Arth {
    public static void main(String[] args) {
        // Create Function of Sub, Sum, Mul, Div
        // parameters (a,b) i/p from user

/*    Logic Building
            Step1 - i/p and o/p data types
    a,b - Scanner (int) > i/p
    o/p - variable result

            Step2 - Rough logic - Create function
     Type4 function With parameters and return type

    Step3 - Write code and Fix > Edge cases*/
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter num1");
        int b = readInt(scanner, "Enter num2");

        int sum = a+b;
        int sub = a-b;
        int Mul = a*b;
        int Div = a/b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(Mul);
        System.out.println(Div);
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter int only");
            System.exit(0);
            return -1;
        }
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int Mul(int a, int b) {
        return a * b;
    }
    static int Div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Div by 0 NA");
        }
        return a / b;
    }
}