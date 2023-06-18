package StudyExample.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex15_ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Marina", lock);
        new Employee("Denis", lock);
        new Employee("Kristina", lock);

    }

}

class Employee extends Thread {
    //у нас каждый работник будет новым потоком

    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        //в конструкторе сразу пропишем, что когда создается конструктор, сразу создается и запускается поток
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждет");
            lock.lock();
            System.out.println(name + " пользуется ATM");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) операцию");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}