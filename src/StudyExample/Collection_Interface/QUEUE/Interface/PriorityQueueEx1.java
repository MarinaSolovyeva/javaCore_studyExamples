package StudyExample.Collection_Interface.QUEUE.Interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue <Integer> prq = new PriorityQueue<>();
        prq.add(4);
        prq.add(1);
        prq.add(7);
        prq.add(10);
        prq.add(8);
        System.out.println(prq); //[1, 4, 7, 10, 8] - 10 до 8!! то есть сортировки зедсь нет, но когда работаем с элементами, сортировка включается

        System.out.println(prq.peek()); //1
    }
}
