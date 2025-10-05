package ex_14_Arrays;

import java.util.Arrays;

public class Lab116_Sec_High_No {
    public static void main(String[] args) {
        int [] nos = {10, 30, 50, 70, 90};
        int [] nos1 = {11, 3, 9, 6, 2};
        //Arrays.sort(nos);
        System.out.println(nos[nos.length-2]); // 70 2nd lowest
        System.out.println(nos1[nos1.length-1]); // 2 1st lowest
    }
}
