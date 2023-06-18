package StudyExample.Multithreading.Methods;

public class Ex6_currentThread implements Runnable{
    public void run(){
        System.out.println("Method run. Thread name is -" + Thread.currentThread().getName());}//
    // показывает в каком потоке мы сейчас находимся
    public static void main(String[] args) {
        Thread myThread6 = new Thread(new Ex6_currentThread());
        myThread6.start();
        System.out.println("Method main. Thread name is -" + Thread.currentThread().getName());

        //Method run. Thread name is -Thread-0
        //Method main. Thread name is -main

        /*
        если в 8 строке написать не старт, а ран, то метод ран будет тоже мэн. почему, потому что новый поток
        здесь не создается, мы также продолаем работать в методе мэйн,ран не запускает поток, соотв весь код был обработан в
        методе мэйн
         */

    }
}
