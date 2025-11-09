package ex_30_Collections_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab204_ArrayList_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        String continueInput = "Y";
        List<String> names = new ArrayList<>(); // String datatype assigned
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter name"); // entered Name
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N"); // Yes / No
            continueInput = scanner.nextLine();
        }
        for (String name: names){
            System.out.println(name);
        }
        scanner.close();
    }
}
