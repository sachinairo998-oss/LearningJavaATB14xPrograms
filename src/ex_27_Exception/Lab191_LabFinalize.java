package ex_27_Exception;

public class Lab191_LabFinalize {
    public static void main(String[] args) {
        Lab191_LabFinalize lab191LabFinalize = new Lab191_LabFinalize();
        lab191LabFinalize = null;
        System.gc();
        System.out.println("main method done");
    }
    @Override
    public void finalize(){
        System.out.println("Hi Called");
    }
}
