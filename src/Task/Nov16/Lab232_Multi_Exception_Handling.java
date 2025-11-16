package Task.Nov16;

public class Lab232_Multi_Exception_Handling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;                   // ArithmeticException
            int num = Integer.parseInt("abc"); // NumberFormatException
            int[] arr = new int[2];
            System.out.println(arr[5]);        // ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
