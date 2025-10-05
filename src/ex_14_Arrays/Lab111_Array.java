package ex_14_Arrays;

public class Lab111_Array {
    public static void main(String[] args) {
        int [] marks = {40, 50, 60, 70, 80, 90};

        // 2nd way to create Array
        int [] marks2 = new int [5];
        int marks3 [] = new int[6]; // Fixed size

        String [] names = new String[3];
        names [0] = "Sachin";
        names [1] = "Sachin1";
        names [2] = "Sachin12";

        boolean [] data = new boolean[2];
        data [0] = true;
        data [1] = false;

        System.out.println(marks.length); // 6
        System.out.println(names.length); // 3
        System.out.println(marks [2]); // 60
        System.out.println(names [0]); // Sachin
        System.out.println(data.length); // 2
        System.out.println(data [1]); // false



    }
}
