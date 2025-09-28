package ex_09_ForLoop;

public class Lab60_NoCond {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
  // since no condition so infinite loop until we stop it by clicking on red button interrupted by signal
            System.out.println(i); // on stopping the exit code will be 130
// on success the exit code will be 0
        }
    }
}
