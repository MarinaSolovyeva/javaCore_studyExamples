package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class AddAll
/*
addAll (ArrayList al) - boolean - добавляет в конец
addAll (int index,ArrayList al) - boolean - добавляет на нужный индекс
 */
    /*
    Добавляет в конец другой Аррэй лист.ТИпы данных должны обязательно совпадать!!
     */ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String sb1 = new String("hello");
        String sb2 = new String("ok");
        String sb3 = new String("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        // list.remove(2); //удаление второго объекта
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(list2);
        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println( );

        list.addAll(1, list2);
        for (String sb : list) {
            System.out.print(sb + " ");
        }
    }
}
