package ex_18_If_Else;

import java.util.Scanner;

public class Lab157_Cal_Bonus_Sal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Years of Experience: ");
        int exp = scanner.nextInt();
        double bonus;

        if (exp < 1)
            bonus = 0;
        else if (exp <= 3)
            bonus = 0.05 * salary;
        else if (exp <= 6)
            bonus = 0.10 * salary;
        else
            bonus = 0.15 * salary;

        System.out.println("Bonus = Rs " + bonus);
    }
}
/*
Enter Salary: 40000
Enter Years of Experience: 5
Bonus = Rs 4000*/
