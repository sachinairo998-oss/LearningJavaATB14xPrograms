package ex_27_Exception;

public class Lab193_Finally_Not_Executed{
    public static void main(String[] args) {
        try {
            int a = 10/10;  // Force exception
        } catch (Exception e) {
            System.out.println("Catching Exception");
            System.exit(0); // JVM exits here → finally won't execute
        } finally {
            System.out.println("I will always be executed");
        }
    }
}
