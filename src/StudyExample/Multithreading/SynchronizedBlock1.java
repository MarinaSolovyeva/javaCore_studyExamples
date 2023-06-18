package StudyExample.Multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {

        MyRunnable2 runnable2 = new MyRunnable2();
        Thread thread1 = new Thread(runnable2);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread3.start();}
}

class Counter2 {
    static int count = 0;}

class MyRunnable2 implements Runnable{

    private void doWork2() {
        System.out.println("Ura");
    }
    public void doWork1 () {//получается у нас часть кода синхронизирована, часть нет
        doWork2();
        System.out.print("Name - " + Thread.currentThread().getName());
        synchronized(this) {//пишу объект чей монитор мы используем для синхронизации, то есть синхронизация на объекте Runnable
        Counter2.count ++;
        System.out.println(Counter2.count);}}
    public void run(){
        for (int i = 0; i<3; i++) {doWork1();}
    }
}
