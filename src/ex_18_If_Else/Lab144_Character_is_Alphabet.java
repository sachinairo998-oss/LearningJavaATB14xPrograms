package ex_18_If_Else;

import java.util.Scanner;

public class Lab144_Character_is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character (a to z or A to Z)");
        char c1 = scanner.next().charAt(0);
        if ((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z')) {
            System.out.println(c1+ " is an alphabet");
        } else {
            System.out.println(c1+ " is not an alphabet");
        }
    }
}
