package StudyExample.Collection_Interface.TreadSafe;

import java.util.concurrent.ArrayBlockingQueue;

public class Ex5_2_ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue <Integer> queue2 = new ArrayBlockingQueue<>(4);
        //Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue2.put(++i);
                    System.out.println("Producer put "+i + queue2);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j =queue2.take();
                    System.out.println("Consumer take "+j + queue2);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}
