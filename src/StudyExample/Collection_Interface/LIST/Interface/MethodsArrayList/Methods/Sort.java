package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList <String> list1 = new ArrayList<>();
        list1.add (s3);
        list1.add (s1);
        list1.add (s4);
        list1.add (s2);

        System.out.println(list1);

        System.out.println();

        Collections.sort(list1);
        System.out.println(list1);
    }
}
