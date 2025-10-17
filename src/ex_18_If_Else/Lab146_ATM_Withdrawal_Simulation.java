package ex_18_If_Else;

import java.util.Scanner;

public class Lab146_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double bal = 10000;
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        } else if (amount > bal) {
            System.out.println("Insufficient Bal");
        } else {
            bal -= amount;
            System.out.println("Withdraw successful!! Remaining Bal " +bal);
        }
    }
}
