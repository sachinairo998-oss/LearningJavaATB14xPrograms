package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab175_Abstraction {
}
 class XYZ {
    XYZ() {
    }
    protected int my_gold = 100;

 }

 class CAB extends XYZ {
    void display(){
        System.out.println(super.my_gold);
    }
 }