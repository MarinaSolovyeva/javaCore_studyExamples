package StudyExample.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex23_1_AtomicInteger {
    static AtomicInteger counter = new AtomicInteger();//by default значение в параметре 0


    public static void increment () {
        counter.incrementAndGet(); //метод incrementAndGet - увеличь и дай
//      counter.getAndIncrement(); //метод getAndIncrement - получаю значение и увеличиваю на единицу
//      counter.addAndGet(5); //метод addAndGet - увеличь на 5 и верни
//      counter.getAndAdd(5); //метод getAndAdd - получаю значение и увеличиваю на 5
//      counter.decrementAndAdd(); //метод decrementAndAdd - уменьшаю и возвращаю
//      counter.getAndDecrement(); //метод getAndDecrement - получаю значение и уменьшаю на 1

        // если понадобится уменьшить напр на 5? counter.addAndGet( -5 );
    }

    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new myRunnableImp());
        Thread thread2 = new Thread(new myRunnableImp());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class myRunnableImp implements Runnable {
    public void run () {
        for (int i = 0; i < 100; i++) {
            Ex23_1_AtomicInteger.increment();
        }
    }
}