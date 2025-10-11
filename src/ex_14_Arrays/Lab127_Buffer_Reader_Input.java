package ex_14_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab127_Buffer_Reader_Input {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // User i/p
        System.out.println("Enter the value if N");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // readLine error so main method throws IO Exception statement

/*        Scanner scanner = new Scanner(System.in); // Other way User i/p
        int n1 = scanner.nextInt();*/

        System.out.println(N); // 10 if entered value is 10

    }
}
