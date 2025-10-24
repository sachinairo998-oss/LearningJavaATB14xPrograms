package ex_18_If_Else;

import java.util.Scanner;

public class Lab162_Website_based_on_Domain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter website URL: ");
        String url = scanner.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("Educational institution");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("Network-related website");
        } else if (url.endsWith(".info")) {
            System.out.println("Informational website");
        } else {
            System.out.println("Unknown or other types of websites");
        }
    }
}
