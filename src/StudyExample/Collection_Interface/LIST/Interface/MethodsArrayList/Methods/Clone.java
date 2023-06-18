package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;

public class Clone // создается новый аррэй лист, который ссылается на те же объекты, что и изначальный аррэй лист

{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList <StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        //ArrayList <StringBuilder> list2 = list1.clone();-будет ошибка компиляции , тк в правой части обджект,
        // а в левой - аррэй лист, нужно сделать так:
        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        //т.о. создали лист 2 который равен клонированному листу 1

        System.out.println(list2.equals(list1));// true

        System.out.println(list1.get(0) == list2.get(0)); // true - нулевые элементы ссылаются на одни и те же объекты



    }
}
