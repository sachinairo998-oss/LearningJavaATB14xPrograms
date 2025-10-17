package ex_18_If_Else;

import java.util.Scanner;

public class Lab143_Grade_Based_on_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks(0-100)");
        int marks = scanner.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("Grade A+");
        }else if (marks >= 80) {
            System.out.println("Grade A");
        }else if (marks >= 70) {
            System.out.println("Grade B");
        }else if (marks >= 60) {
            System.out.println("Grade C");
        }else if (marks >= 50) {
            System.out.println("Grade D");
        }else if (marks >= 40) {
            System.out.println("Grade E");
        }else {
            System.out.println("Fail");
        }
    }
}
