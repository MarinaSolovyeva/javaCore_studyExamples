package StudyExample.Multithreading;

public class Ex3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread3());// в параметр конструктора вставляем объект класса MyThread3
        Thread thread2 = new Thread(new MyThread4());// в параметр конструктора вставляем объект класса MyThread4

        thread1.start();
        thread2.start();
    }
}

class MyThread3 implements Runnable {
    //интерфейс который имеет единственный метод run
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}