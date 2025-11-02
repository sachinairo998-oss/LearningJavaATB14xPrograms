package ex_30_Collections_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab203_ArrayList3 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(85);
        marks.add(97);
        marks.add(80);
        marks.add(71);

        System.out.println(marks); // [91, 85, 97, 80, 71]
        Collections.sort(marks);
        System.out.println(marks); // [71, 80, 85, 91, 97]
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks); // [97, 91, 85, 80, 71]
    }
}
