package ex_14_Arrays;

public class Lab113_Arrays_Max_Min {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        // logic
        // Arrays.sort(array);
        // System.out.println (array[array.length-1]);

/*        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max); // 90*/

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[0] < min) {
                min = array [0];

            }
        }
        System.out.println(min); // 10
    }
}
