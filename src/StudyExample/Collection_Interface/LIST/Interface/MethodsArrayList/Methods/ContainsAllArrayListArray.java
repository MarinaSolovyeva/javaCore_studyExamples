package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;

public class ContainsAllArrayListArray {
    //содержит ли мой первый лист все элементы что есть во втором листе?
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        System.out.println("al1 = " +al1); //[one, two, three, four, five]

        ArrayList <String> al2 = new ArrayList<>();
        al2.add ("one");
        al2.add ("three");
        al2.add ("four");
        al2.add ("ten");
        System.out.println("al2 = " +al2); //[one, two, three, four, five]

        boolean result = al1.containsAll (al2);
        System.out.println(result); // false

    }
}
