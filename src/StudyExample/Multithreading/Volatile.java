package StudyExample.Multithreading;

public class Volatile extends Thread {


    volatile boolean b = true;
    public void run () {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. Counter = "+ counter);
    }

    public static void main(String[] args) throws InterruptedException{
        Volatile thread= new Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it's time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");

        /*After 3 seconds it's time to wake up
        Loop i sfinished.

        Если не написать volatile, у нас будет выход только первой строки
         */



    }
}
