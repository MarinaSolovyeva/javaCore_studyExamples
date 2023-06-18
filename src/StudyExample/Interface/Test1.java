package StudyExample.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Masha");
        list1.add("Dasha");
        list1.add("Anya");
        list1.add("Nastya");
        System.out.println("Pered sortirovkoy");
        System.out.println(list1); //[Masha, Dasha, Anya, Nastya]
        Collections.sort(list1);
        System.out.println("Posle sortirovkoy"); //[Anya, Dasha, Masha, Nastya]
        System.out.println(list1);
    }
}
