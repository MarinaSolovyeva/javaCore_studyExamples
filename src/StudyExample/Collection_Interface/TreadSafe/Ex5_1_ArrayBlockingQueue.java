package StudyExample.Collection_Interface.TreadSafe;

import java.util.concurrent.ArrayBlockingQueue;

public class Ex5_1_ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue <Integer> queue = new ArrayBlockingQueue<>(4);
        //когда создаем ArrayBlockingQueue всегда должны указать что есть какой то размер
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);/*если добавить 5 элемент через add, выбросится Exception IllegalStateException: Queue full
        а если через offer  - exception нет, просто 5 не добавится*/
        System.out.println(queue);

    }
}
