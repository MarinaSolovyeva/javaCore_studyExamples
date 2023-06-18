package StudyExample.Multithreading;

public class Ex11_DataRace {
    static int counter = 0;
    public static synchronized void increment() {
        counter++;
//добавляем синхронайзд в описание нашего метода,
// и теперь сколько бы раз мы не запускали программу, всегда будет выводитьсч 200
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            Ex11_DataRace.increment();
        }
    }
}/*
200. 174 -происходит data race. потому что работа наша потоков не синхронизированы.
 они не обращают внимание на то что они могут мешать друг другу


чтобы этой ситуации не было, можем поставить lock - замок
и наш метод может одновременно работать только в 1 потоке в одном и том же периоде времени
ставится замок на необх участок кода, только 1 поток сможет выполнять наш участок кода


 */