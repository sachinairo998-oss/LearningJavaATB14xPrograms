package ex_27_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab189_Throws {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader f = new FileReader("Sachin"); // java: unreported exception java.io.FileNotFoundException
    }
}
