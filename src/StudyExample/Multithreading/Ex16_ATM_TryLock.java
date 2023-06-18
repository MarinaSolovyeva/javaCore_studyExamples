package StudyExample.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex16_ATM_TryLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee16("Marina", lock);
        new Employee16("Denis", lock);
        new Employee16("Kristina", lock);
        Thread.sleep(5000);
        new Employee16("Victor", lock);
        new Employee16("Petr", lock);
    }
}

class Employee16 extends Thread {
    String name;
    private Lock lock;

    public Employee16(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " пользуется ATM");
                Thread.sleep(2000);
                System.out.println(name + " завершил(а) операцию");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}