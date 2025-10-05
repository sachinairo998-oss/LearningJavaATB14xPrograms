package ex_15_StringBuffer_Builder_String_Function;

public class Lab104_String_Func {
    public static void main(String[] args) {
        String name = "Sachin";

        System.out.println(name.length()); // 6
        System.out.println(name.charAt(3)); // h
        // System.out.println(name.charAt(10)); //since out of index of so exception

        //Concat ()
        System.out.println(name.concat("M")); // SachinM

        //Contains ()
        System.out.println(name.contains("S")); // True

        // Equals ()
        System.out.println(name.equals("Sachin")); // True

        // equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("Sachin")); // True

        // indexOf  ()
        System.out.println(name.indexOf('n')); // 5

        String s1 = "madam";
        System.out.println(name.indexOf("m")); // 0 returns 1st occurrence

        // substring ( , )
        System.out.println(name.substring(1, 3)); // ac

        // toLowerCase()
        System.out.println(name.toLowerCase()); // sachin

        // toUpperCase()
        System.out.println(name.toUpperCase()); // SACHIN

        // startsWith()
        System.out.println(name.startsWith("S")); // True

        // endsWith(n)
        System.out.println(name.endsWith("n")); // True

        // trim()
        String s3 = " Sachin123 ";
        System.out.println(s3.trim()); // Sachin123 > space trim

        // compareTo()
        System.out.println(name.compareTo("Sachin")); // 0

        StringBuilder stringBuilder = new StringBuilder("Sachin");
        System.out.println(stringBuilder); //  Sachin

        stringBuilder.reverse();
        System.out.println(stringBuilder); // nihcaS




    }

}
