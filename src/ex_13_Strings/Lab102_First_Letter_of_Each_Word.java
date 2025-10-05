package ex_13_Strings;

import java.util.Scanner;

public class Lab102_First_Letter_of_Each_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Words");
        String str = scanner.nextLine();
        System.out.println("First letter of words");
        boolean isWordStart = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && isWordStart) {
                System.out.println(ch);
                isWordStart = false;
            } else if (ch == ' ') {
                isWordStart = true;
            }
        }
       // System.out.println("First letter of words");
    }
}
