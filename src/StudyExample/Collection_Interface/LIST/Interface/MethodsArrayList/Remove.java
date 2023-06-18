package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class Remove {
    /* удаление
    remove (Object e) - boolean
    remove (Index) - DataType
    если по индексу, то в аутпуте получу этот удаленный объект, а если  обджект, то булеан
     */
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        // list.remove(2); //удаление второго объекта
        list.remove(sb1);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
            //если удалить то чего нет, будет эксепшен
        }

        // Если работаем со стрингами, там можно указывать значения

        //новый массив при ремув не создается, просто элементы сдвигаются влево


    }
}



