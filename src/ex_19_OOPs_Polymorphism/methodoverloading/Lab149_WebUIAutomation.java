package ex_19_OOPs_Polymorphism.methodoverloading;

public class Lab149_WebUIAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.StartBrowser();
        b1.StartBrowser("Chrome");
    }
}
 class Browser{
    void StartBrowser () {
        System.out.println("Default Browser Started"); // o/p - no parameters
     }
     void StartBrowser(String browser){
         System.out.println("Starting browser "+ browser); // o/p - Chrome
     }


 }