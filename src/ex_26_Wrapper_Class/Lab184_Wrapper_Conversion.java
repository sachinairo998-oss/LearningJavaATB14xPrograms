package ex_26_Wrapper_Class;

public class Lab184_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";
        int aa = 10;

        // String > Wrapper Conversion
        Integer a = Integer.parseInt(num);
        // parse function used for Wrapper conversion
        // Double.parseDouble()
        // Float.parseFloat()
        // Long.parseLong()

        // String > Primitive data type conversion
        int a_p = Integer.parseInt(num);

        Integer aa3 = Integer.valueOf(10);
        System.out.println(aa3); // 10

        Integer a10 = 10;
        String s = a10.toString();
        System.out.println(s); // 10
        System.out.println(s instanceof String); // true

    }
}
