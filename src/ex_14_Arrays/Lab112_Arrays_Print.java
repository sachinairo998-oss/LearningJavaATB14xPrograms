package ex_14_Arrays;

public class Lab112_Arrays_Print {
    public static void main(String[] args) {
        int [] marks = {20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("-------");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
            }

        System.out.println("----------Enhanced for loop----------");

        for (int mark : marks){
            System.out.println(mark);
        }
        }
    }

