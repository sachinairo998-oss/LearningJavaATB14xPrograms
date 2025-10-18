package ex_21_OOPs_Access_Modifier.police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    // Method & Behaviour
    protected void canIShoot(){
    System.out.println("Yes You Can");
} // Protected and Default works in sameway, cannot be assigned in another class
 void thisDefaultF1(){
     System.out.println("Hi Cop");




 }

}
