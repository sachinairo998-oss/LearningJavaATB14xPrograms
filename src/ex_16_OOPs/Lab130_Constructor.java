package ex_16_OOPs;

public class Lab130_Constructor {
    public static void main(String[] args) {
        student s1 = new student();
        // class Ref = Object Constructor
        student s2 = new student("Sachin");
    }
}
 class student {  // local class difficult to access need to import for using
    String name;   // Only 1 public class in 1 file
     /*
 class student1{
    String name;
 }*/
// One file multiple classes difficult to maintain so we create separate classes like StudentX

     // Default Constructor JVM Created
     student(){
         System.out.println("Hi I am called"); // o/p
     }

     // Parameterised Constructor
     student(String name){
         System.out.println("Hi " + name); // o/p - Hi Sachin
     }

     void sleep(){}
     void study(){}
     void eat(){}

 }
