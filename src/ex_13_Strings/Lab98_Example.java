package ex_13_Strings;

public class Lab98_Example {
    public static void main(String[] args) {
        String s = "Sachin".substring(2);
        System.out.println(s); // chin

        String s1 = "Sachin".substring(1,3);
        System.out.println(s1); // ac

        char[] arr = "Sachin".toCharArray();
        System.out.println(arr); // 'S','a','c','h','i','n'

        String st = " Sachin ".trim();
        System.out.println(st); // no space Sachin

        boolean b = "".isBlank();
        System.out.println(b); // True

        String s2 = "ab".repeat(3);
        System.out.println(s2); //ababab

        boolean b11 = "Sachin".equalsIgnoreCase("Sachin");
        System.out.println(b11); // True

        long count = "a\nb\nc".lines().count();
        System.out.println(count); // 3
    }
}
