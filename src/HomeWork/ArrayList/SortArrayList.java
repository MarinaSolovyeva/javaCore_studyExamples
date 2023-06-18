package HomeWork.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static ArrayList <String> abc (String...s) {
        ArrayList<String> al1 = new ArrayList<>();
        for (String s1 : s) {
            if (!al1.contains(s1)) {
                al1.add(s1);
            }
        }
        Collections.sort(al1);
        System.out.println(al1);
        return al1;
    }


    public static void main(String[] args) {
        abc("Morning", "Evening" , "Night", "Morning");
    }
}

