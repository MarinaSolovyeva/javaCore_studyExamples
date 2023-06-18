package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Iterator;

import java.util.ArrayList;
import java.util.Iterator; // как вывести значения листа на экран

public class Basic {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        Iterator<String> it = list1.iterator();
        /* Итератор - повторитель, с помощь объекта it мы сможем пробежаться по элементам листа
         */
        while (it.hasNext()) { // метод hasNext - смотрит есть дальше элемент или нет?
            System.out.println(it.next()); //метод next выдает этот  будущий элемент
        }
        //если есть дальше элемент мы будем входить в тело while и будем выводить it.next


        /* отличие в от for each в том, что с помощью итератора я могу удалить элемент листа, а с помощью for each нет,
        как это делается: */

        while (it.hasNext()) {
            it.next();
            it.remove();
        }// сначала проверка есть элемент будущий? если да, он выводится.и дальше он удаляется
    }
}
