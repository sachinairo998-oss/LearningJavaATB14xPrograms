package ex_27_Exception;

public class Lab188_Try_Catch {
    public static void main(String[] args) {
        String s1 = null;
        // java.lang.NullPointerException
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error, Trim not allowed"); // o/p - Error, Trim not allowed
        }

    }
}
