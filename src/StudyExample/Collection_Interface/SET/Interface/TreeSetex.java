package StudyExample.Collection_Interface.SET.Interface;

import java.util.TreeSet;

public class TreeSetex {
    public static void main(String[] args) {
        TreeSet <Integer> treeset = new TreeSet<>();
        treeset.add(5);
        treeset.add(8);
        treeset.add(2);
        treeset.add(1);
        treeset.add(10);
        //    treeset.add(null);  хранить не может, бдет exception
        System.out.println(treeset); //[1, 2, 5, 8, 10]
        //
    }
}
