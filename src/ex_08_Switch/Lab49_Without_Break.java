package ex_08_Switch;

import java.util.Scanner;

public class Lab49_Without_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to 7 Values");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Mon");
                case 2:
                    System.out.println("Tue");
                case 3:
                    System.out.println("Wed");
                case 4:
                    System.out.println("Thu");
                case 5:
                    System.out.println("Fri");
                case 6:
                    System.out.println("Sat");
                case 7:
                    System.out.println("Sun");
                default:
                    System.out.println("No");
            }  // bcoz no break so entered value and its below values will be considered
        } else {
            System.out.println("Enter a valid number");
        }
    }
}