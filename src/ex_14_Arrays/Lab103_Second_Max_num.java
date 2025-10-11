package ex_14_Arrays;

public class Lab103_Second_Max_num {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) { // Array only square bracket
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != secondMax) {
                secondMax = numbers[i];
            }
        }
        System.out.println(secondMax);
    }
}
