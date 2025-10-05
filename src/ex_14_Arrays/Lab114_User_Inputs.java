package ex_14_Arrays;

import java.util.Scanner;

public class Lab114_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size"); // 2
        int size = scanner.nextInt();

        int[] nos_marks = new int[size];

        for (int i = 0; i < nos_marks.length; i++) {
            System.out.println("Enter elements " + i);
            nos_marks[i] = scanner.nextInt(); // 10 20
            }
            
        }
    }
