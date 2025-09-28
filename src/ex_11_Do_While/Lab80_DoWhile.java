package ex_11_Do_While;

public class Lab80_DoWhile {
    public static void main(String[] args) {
        int a = 5;
        do {
            System.out.println("Body!"); // o/p = Body 5 6 7 8 9
            System.out.println(a); // starts from 5
            a++; // from 5 till 9 as 10 < 10 condition fails
        } while (a < 10);
    }
}
