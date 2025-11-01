package ex_27_Exception;

import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Lab190_LabThrow {
    public static void main(String[] args) throws CustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.next();

        if (!input.equalsIgnoreCase("Sachin")) {
            throw new CustomException("Not Allowed");
        } else {
            System.out.println("Welcome, Sachin!");
        }
        scanner.close();
    }
}
