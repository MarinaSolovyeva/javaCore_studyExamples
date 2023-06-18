package StudyExample.Multithreading;

public class Ex10_DataRace {
    public static void main(String[] args) {

   MyRunnable runnable = new MyRunnable();
   Thread thread1 = new Thread(runnable);
   Thread thread2 = new Thread(runnable);
   Thread thread3 = new Thread(runnable);
    thread1.start();
    thread2.start();
    thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable{

    public synchronized void inctement () {
        Counter.count ++;
        System.out.print(Counter.count + " ");
        System.out.println("Thread name" + Thread.currentThread().getName());
    }
    public void run(){
        for (int i = 0; i<3; i++)
        {
            inctement();
        }

    }
}

//1 3 4 5 6 7 2 8 9  -нет никакой последовательности выводимых чисел,запустим еще раз - аутпут будет другим
// кажд новый запуск дает новый результат. даже если дописать volatile- ничего не изменится