package StudyExample.Multithreading.Methods;

public class Ex8_Sleep_Join extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        System.out.println(thread1.getState());
        Ex8_Sleep_Join thread2 = new Ex8_Sleep_Join();
        System.out.println(thread2.getState());
        thread1.start();
        thread2.start();
        System.out.println("Final"); //final выводится первым, почему
        //потому что метод мэйн создал два поток, они от него отпочковали, а мэйн не спит,
        // он продолжает работу, и сразу запускает на консоль final

        //если мы хотим чтобы main дождался выполнения других двух потоков и только потом продолжил свою работу и в
        //самый конец вывел final, нужно использовать метод join - он тоже выбрасывает InterruptedException
        //поток в котором вызывается join будет ждать. не thread1/2 будут ждать,
        // а мэйн будет ждать тот поток, на котором вызван мэйн
        thread1.join(1500); //если написать так, метод мэйн будет ждать
        // пока не закончится этот поток или пока не пройдет 1,5секунды
        thread2.join();
    }
}
//Final
//Thread-1 1
//Thread-0 1
//Thread-1 2
//Thread-0 2
//Thread-1 3
//Thread-0 3
//Thread-1 4
//Thread-0 4
//Thread-1 5
//Thread-0 5
//Thread-1 6
//Thread-0 6
//Thread-0 7
//Thread-1 7
//Thread-1 8
//Thread-0 8
//Thread-1 9
//Thread-0 9

class MyRunnable implements Runnable { // нпри переопределении метода ран нельзя написать throwsException, поэтому
    //  используем трай кэтч.
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
