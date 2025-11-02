package ex_27_Exception;

import java.util.Scanner;

public class Lab192_Throws {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int user_age = scanner.nextInt();
        validate_age_for_club(user_age);

    }
    static void validate_age_for_club(int age) throws Exception {
        if (age < 25) {
            throw new Exception("Age cant be less than 25");
        } else{
            System.out.println("Enjoy Clubbing");
        }
    }
}

