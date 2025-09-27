package ex_08_Switch;

import java.util.Scanner;  // ✅ You missed this import

public class Lab48_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // ✅ Scanner object created
        System.out.println("Enter Days from 1 to 7");

        if (scanner.hasNextInt()) {   // ✅ Checks if the user entered a number
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break; // bcoz of break only the entered value will be considered
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("No");
            }
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}
