package ex_13_Strings;

import java.util.Scanner;

public class Lab100_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse");
        String str = scanner.nextLine();
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
