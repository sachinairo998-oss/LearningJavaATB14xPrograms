package ex_14_Arrays;

public class Lab110_Array {
    public static void main(String[] args) {
        int a = 10;
        int marks [] = {50, 60, 70, 80, 90, 96, 98}; // Array syntax

        boolean [] is_married_couple = {true, true, false};

        System.out.println(marks.length); // 7 Index will start from 0 always
        System.out.println(marks[0]); // 50
        System.out.println(marks[3]); // 80

        // System.out.println(marks[-1]); // exception

        String name = "Sachin";
        String[] name_each_element_char = name.split("");
        for (String s: name_each_element_char){
            System.out.println(s); // S a c h i n
        }
    }
}
