package ex_29_Generics;

public class Lab196_Generic {
    public static void main(String[] args) {
        temp_sum(10, 15);
        temp_sum(10.15, 3.14);

    }
/*
    static Integer temp_sum (Integer a, Integer b){
        return a+b;
    }
    static Double temp_sum (Double a, Double b){
        return a+b;
    }
*/

    static <T> T temp_sum(T a, T b){
        return null;
    }
}
