package ex_18_If_Else;

import java.util.Scanner;

public class Lab142_Year_is_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        if ((year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year+ " is a Leap year");
        } else {
            System.out.println(year+ " is not a Leap year");
        }
    }
}
