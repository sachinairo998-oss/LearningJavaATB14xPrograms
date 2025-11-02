package ex_29_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab198_Real_Automation {
    public static void main(String[] args) {
     //   List <Integer> list_web_element = new ArrayList<>();
        //   if no datatype attached then all datatypes will be accepted with no constraint
        List list_web_element = new ArrayList<>();
        list_web_element.add("Sachin");
        list_web_element.add(123);
        list_web_element.add(true);
        list_web_element.add(3.14);
    }
}
