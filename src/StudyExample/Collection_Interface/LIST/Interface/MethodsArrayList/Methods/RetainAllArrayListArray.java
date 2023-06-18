package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;

public class RetainAllArrayListArray {
    //удаляет уникальные значения
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

        al1.retainAll(al2);
        System.out.println(al1);//[one, three, four]
        System.out.println(al2);//[one, three, four, ten]

    }
}
