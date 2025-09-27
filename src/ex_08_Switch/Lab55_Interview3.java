package ex_08_Switch;

public class Lab55_Interview3 {
    public static void main(String[] args) {
        char c = 'A'; // since C = A so case A will be considered
        switch (c) {
            case 'A' -> System.out.println("65");
            case 'B' -> System.out.println("66");
            default -> System.out.println("Hello");
        }
    }
}
