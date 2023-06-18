package StudyExample.Collection_Interface.QUEUE.Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();

        //add     добавляет элемент в конец очереди. если очередь ограничена и мы добавляем новых людей  - выбросится exception
        queue.add("Marina");
        queue.add("Denis");
        queue.add("Anya");
        queue.add("Pasha");
        queue.add("Misha");

        System.out.println(queue); //[Marina, Denis, Anya, Pasha, Misha]

        /* offer   = add  добавляет элемент в конец очереди.
        если очередь ограничена и мы добавляем новых людей  - exception не выбросится, но и человек не добавится */


        // _____________________remove
        System.out.println(queue.remove());// удаляет первый элемент.
        // если удалить больше элементов, чем есть у нас, выбросится NoSuchElementException
        System.out.println(queue);

        // но можем удалить и из середины очереди queue.remove("Anya")

        // _____________________poll  = remove
        System.out.println(queue.remove());// удаляет первый элемент.
        // если удалить больше элементов, чем есть у нас, NoSuchElementException не выбросится . но выведется null
        System.out.println(queue);

        // _____________________element
        System.out.println(queue.remove());// показывает первый элемент.
        // если показать больше элементов, чем есть у нас, выбросится NoSuchElementException
        System.out.println(queue);

        // _____________________element  = peek
        System.out.println(queue.remove());// показывает первый элемент.
        // если показать больше элементов, чем есть у нас,  NoSuchElementException не выбросится. но выведется null
        System.out.println(queue);
    }
}
