package StudyExample.Multithreading.TreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex1_1_ExecutorServiceFixed {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
// для того чтобы создать тредпул, будем использовать один из фэктори' методов класса Executors,
// говорим сколько потоков создаем. то есть здесь создали потоки не с помощью конструктора,
// а с помощью метода, поэтому он и назвается factory. фабрика по производству потоков.
// этот метод возвращает нам ThreadPoolExecutor.  важно чотметить, что программа не заканчивается.
// ExecuteService ждет новых тасков. если мы не собираемся давайть новых тасков, обяазательно добавляем строку

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnaleImp100());//передаем ему объект который имплементирует runnable.
            // метод Execute передает наш таск в thread pool , где оно выполняется одним из потоков
        }
        executorService.shutdown();//важно чотметить, что программа не заканчивается.
// ExecuteService ждет новых тасков. если мы не собираемся давайть новых тасков, обяазательно добавляем строку
        executorService.awaitTermination(5, TimeUnit.SECONDS);//вызывается всегда после shutDown.
        // принимает два параметра: время, и юнит. метод выбрасывает interrupted Exception. метод работает как метод join,
        // заставляет поток в котором он вызывается ждать. то есть мэйн будет ждать, пока executorService не закончит всю свою работу,
        // либо пока не пройдет указанное время: какое дейсвие ранее пройдет, то и произойдет
        System.out.println("Main ends");
    }
}

class RunnaleImp100 implements Runnable{
    public void run () {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}