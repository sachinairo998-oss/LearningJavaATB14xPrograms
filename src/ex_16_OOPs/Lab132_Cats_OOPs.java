package ex_16_OOPs;

public class Lab132_Cats_OOPs {
    public static void main(String[] args) {
        cat c1;
        cat c2;
        cat c3 = new cat();
        cat c4 = new cat("Booster");
        System.out.println(c3.name); // Kitty
        System.out.println(c4.name); // Booster

        c4.running();
    }
}
class cat{
    String name; // instance variable
    cat(){
        name = "Kitty"; // no parameters
    }
    cat (String name) {
        this.name = name; // this keyword will point to c4 since parameters and value present
    }
    void running() {
        int local_var = 10; // Local variable
        System.out.println("Who is Running "+ this.name); // o/p - Booster
    }

}

