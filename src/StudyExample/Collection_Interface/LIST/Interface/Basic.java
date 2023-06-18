package StudyExample.Collection_Interface.LIST.Interface;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //   list.add  -метод с помощью которого я могу добавлять объекты в лист
        list.add("privet");
        Car c = new Car();
        list.add(c); // могу добавлять объекты
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok")); // могу писать и так

        ArrayList <String> list2 = new ArrayList <> (30);//я говорю,
        // что мой лист будет содержать только объект типа стринг. писать в правой части тип данных НЕ обязательно, но <> правильнее писать
        list2.add("poka");
        ArrayList <String> list5 = new ArrayList <> (list2);
        System.out.println(list2.equals(list5));//true, содержимое равно, но объекты разные
        System.out.println(list2==list5);//false. тк объекты разные

        ArrayList <StringBuilder> list3 = new ArrayList ();
        //List <StringBuilder> list3 = new ArrayList (); - можно написать вот так


    }
}
class Car {}
class Student {}