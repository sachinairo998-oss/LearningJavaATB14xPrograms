package ex_13_Strings;

public class Lab96_Interviews {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";  // since no value change so will be stored once in String Constant Pool

        String s5 = new String("sachin");
        String s6 = new String("sachin"); // will be saved multiple times in Heap Object Area

        // Comparison String > check for reference
        System.out.println(s1 == s2); // True
        System.out.println(s1 == s5); // False
        System.out.println(s5 == s6); // False

        // equals (content) > value check
        System.out.println(s1.equals(s2)); // True
        System.out.println(s1.equals(s5)); // False
        System.out.println(s1.equals(s6)); // False
        System.out.println(s1.equalsIgnoreCase(s6)); // since False actual value so True will be o/p
    }
}
