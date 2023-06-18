package StudyExample.Collection_Interface.LIST.Interface.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {

    public static void main(String[] args) {
//        ArrayList <String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Marina");
//        arrayList1.add("Denis");
//        arrayList1.add("Anya");
//        arrayList1.add("Pasha");
//
//        System.out.println(arrayList1); //[Marina, Denis, Anya, Pasha]
//
//        Iterator <String> iterator = arrayList1.iterator();
//        while (iterator.hasNext()) // если есть следующий элемент
//        {System.out.print(iterator.next() + " "); //выводи на экран следующий элемент - Marina Denis Anya Pasha
//        }

        CopyOnWriteArrayList <Integer> list = new CopyOnWriteArrayList<>(
        );
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator <Integer> iterator1 = list.iterator();
        list.add(5);

        while (iterator1.hasNext()) {System.out.print(iterator1.next() + " ");
    }
}}
