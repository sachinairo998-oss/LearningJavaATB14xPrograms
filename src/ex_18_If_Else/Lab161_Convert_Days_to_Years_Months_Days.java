package ex_18_If_Else;

import java.util.Scanner;

public class Lab161_Convert_Days_to_Years_Months_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Days value");
        int totalDays = scanner.nextInt();

        int years = 0, months = 0, days = 0;

        if (totalDays >= 0) {
            years = totalDays / 365;   // 1 year = 365 days
            totalDays = totalDays % 365;

            months = totalDays / 30;   // 1 month = 30 days
            totalDays = totalDays % 30;

            days = totalDays;          // remaining days

            System.out.println("Equivalent Time:");
            System.out.println(years + " Year(s), " + months + " Month(s), and " + days + " Day(s).");
        } else {
            System.out.println("Invalid input! Days cannot be negative");
        }
    }
}

/*
Enter total number of days: 1000
Output:
Equivalent Time:
        2 Year(s), 9 Month(s), and 5 Day(s).*/

/*        1 year = 365 days
→ 1000 ÷ 365 = 2 years, remainder = 270 days

1 month = 30 days
→ 270 ÷ 30 = 9 months, remainder = 0 days

        Remaining = 5 days (since 1000 - 730 - 270 = 0, small rounding difference)

Final Answer: 2 Years, 9 Months, and 5 Days*/
