package ex_18_If_Else;
import java.util.Scanner;

public class Lab158_Cal_Employee_Net_Sal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double gross = basic + hra + da;
        double tax;

        if (gross <= 50000)
            tax = 0;
        else
            tax = 0.10 * gross;

        double net = gross - tax;
        System.out.println("Net Salary = Rs " + net);
    }
}

/*
Net = Gross - Tax
        Gross = Basic + HRA + DA
Tax = 10% if Gross > 50,000, else 0

Enter Basic Salary: 60000
Net Salary = Rs 70200.0
Explanation:
Gross = 60000 + 12000 + 6000 = 78000 → Tax = 10% of 78000 = 7800 → Net = 78000 - 7800 = 70200*/
