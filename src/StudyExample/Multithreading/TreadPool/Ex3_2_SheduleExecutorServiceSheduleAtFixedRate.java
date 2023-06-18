package StudyExample.Multithreading.TreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex3_2_SheduleExecutorServiceSheduleAtFixedRate {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new RunnaleImp320(), 3,1,TimeUnit.SECONDS);
        //метод планирует задачу для периодического выполнения. впервые эта задача обработается через три секунды
        // от запуска метода. а потом будет выполняться с периодичностью 1 секунда.
        // то есть считается дата начала первого задания и дата начала второго задания
        Thread.sleep(20_000);
        scheduledExecutorService.shutdown();
    }
}
class RunnaleImp320 implements Runnable{
    public void run () {
        System.out.println(Thread.currentThread().getName() + " begins work");
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}