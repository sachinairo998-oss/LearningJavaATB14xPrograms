package ex_08_Switch;

public class Lab54_Jdk13_multiplecases {
    public static void main(String[] args) {
        int itemcode = 220;
        switch (itemcode) {
            case 001,002,003 :
                System.out.println("All");
                break;
            case 004,220,221 :
                System.out.println("One");
                break;
            default:
                System.out.println("No");
        }
    }
}
