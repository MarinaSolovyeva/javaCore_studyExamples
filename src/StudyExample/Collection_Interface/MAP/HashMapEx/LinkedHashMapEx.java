package StudyExample.Collection_Interface.MAP.HashMapEx;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Studenthash > lhm = new LinkedHashMap(16,0.75f, true);
        //по умолчанию false, а если написать true - будет храниться инфо о порядке хранения элементов
        Studenthash st1 = new Studenthash("Masha", "Petrova", 4);
        Studenthash st2 = new Studenthash("Pasha", "Ivanov", 2);
        Studenthash st3 = new Studenthash("Dasha", "Leonova", 4);
        Studenthash st4 = new Studenthash("Dima", "Rojkov", 1);
        lhm.put(5.8, st1);
        lhm.put(4.2, st4);
        lhm.put(9.2, st3);
        lhm.put(6.4, st2);

        System.out.println(lhm);

    }
}