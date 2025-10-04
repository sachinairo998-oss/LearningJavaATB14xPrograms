package ex_13_Strings;

public class Lab99_Example3 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c); //v

        int result = "abc".compareTo("ABC");
        System.out.println(result); //32

        int idx = "Java".indexOf("a");
        System.out.println(idx); //1

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2); //3

        boolean b = "".isEmpty();
        System.out.println(b); // True

        String s11 = String.join("-","Java","Python");
        System.out.println(s11); //Java-Python // Concat no hyphen

        String s12 = "Java".replace('a','o');
        System.out.println(s12); //Jovo

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1); // True

        String b2 = "Java".concat("Mava");
        System.out.println(b2); // JavaMava

    }
}
