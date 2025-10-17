package ex_18_If_Else;

import java.util.Scanner;

public class Lab145_Number_is_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2 ; i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num+ " is a Prime no.");
        } else {
            System.out.println(num+ " is not a Prime no.");
        }
    }
}
