package ex_10_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab79_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numberTOGuess = random.nextInt(100)+1; // for 100 value consideration
        System.out.println(numberTOGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no."); // Enter value
        int guess;
        int attempts = 0;

        while (true) {
            if (!scanner.hasNext()) {
                System.out.println("Invalid I/p ! Enter a no.");
                scanner.next(); // consume invalid token
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter no. b/w 1 and 100");
                continue;
            }
            if (guess < numberTOGuess) {
                System.out.println("Too Low");
            } else if (guess > numberTOGuess) {
                System.out.println("Too High");
                continue;
            } else {
                System.out.println("Correct! You guessed it in " +attempts+ " attempts");
                // o/p = Correct! You guessed it in 10 attempts
                break;
            }
        }
    }

}
