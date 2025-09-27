package ex_08_Switch;

import java.util.Scanner;

public class Lab50_RealSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Browser");

        String browser = scanner.nextLine(); // ✅ Read browser input

        switch (browser.toLowerCase()) {  // ✅ Convert to lowercase to handle case variations
            case "chrome":
                System.out.println("Start Chrome");
                break;
            case "firefox":
                System.out.println("Start Firefox");
                break;
            case "edge":
                System.out.println("Start Edge");
                break;
            default:
                System.out.println("No");
                break;
        }

        scanner.close();  // ✅ Always close the scanner
    }
}
