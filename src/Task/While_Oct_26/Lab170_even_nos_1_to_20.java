package Task.While_Oct_26;

public class Lab170_even_nos_1_to_20 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

