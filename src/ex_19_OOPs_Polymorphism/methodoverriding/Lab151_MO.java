package ex_19_OOPs_Polymorphism.methodoverriding;

public class Lab151_MO {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();

    }
}
 class Father {
     void home() {
         System.out.println("2bhk");
     } // Child class overrides Parent Class > Runtime Polymorphism
 }
    class Son extends Father{ // Son can extend from Father
        @Override
            void home(){
             System.out.println("3bhk"); // Overriding
         }
     }
