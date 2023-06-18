package StudyExample.Collection_Interface.MAP.HashMapEx;

import StudyExample.Collection_Interface.MAP.HashMapEx.Studenthash;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {


    TreeMap <Double, Studenthash> treeMap = new TreeMap<>();
    Studenthash st1 = new Studenthash("Masha", "Petrova", 4);
    Studenthash st2 = new Studenthash("Pasha", "Ivanov", 2);
    Studenthash st3 = new Studenthash("Dasha", "Leonova", 4);
    Studenthash st4 = new Studenthash("Dima", "Rojkov", 1);
    Studenthash st5 = new Studenthash("Sasha", "Romanov", 5);
    Studenthash st6 = new Studenthash("Petya", "Molotov", 2);
    Studenthash st7 = new Studenthash("Kolya", "Sosnov", 3);
    Studenthash st8 = new Studenthash("Kolya", "Sosnov", 3); // можем добавить копию студента с такими же значениями, но разными оценками
    treeMap.put (5.8, st1);
    treeMap.put (4.2, st4);
    treeMap.put (9.2, st3);
    treeMap.put (6.4, st2);
    treeMap.put (8.0, st5);
    treeMap.put (5.9, st7);
    treeMap.put (7.2, st6);
    treeMap.put (8.1, st8);

        System.out.println(treeMap); //вывелась сортировка по возрастанию по ключу!
        System.out.println(treeMap.get(8.0)); // Student{name='Sasha', surname='Romanov', course=5}

        treeMap.remove(5.8);
        System.out.println(treeMap);

        //переворачивает tree map - по убыванию
        treeMap.descendingMap();
        System.out.println(treeMap);


        //tailMap       headMap
        System.out.println(treeMap.tailMap(5.0)); // выдает на выходе студентов с баллом выше 5
        System.out.println(treeMap.headMap(5.0)); // выдает на выходе студентов с баллом ниже 5


        //lastEntry     firstEntry
        System.out.println(treeMap.lastEntry()); // выдает последний элемент
        System.out.println(treeMap.firstEntry()); // выдает первый элемент


}
}