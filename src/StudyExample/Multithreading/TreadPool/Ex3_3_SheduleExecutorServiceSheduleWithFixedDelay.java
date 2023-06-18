package StudyExample.Multithreading.TreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex3_3_SheduleExecutorServiceSheduleWithFixedDelay {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnaleImp320(), 3,1,TimeUnit.SECONDS);
        //выполнит впервые таск через три секунды,  считается дата окончания первого
        // задания и дата начала второго задания
        Thread.sleep(20_000);
        scheduledExecutorService.shutdown();
    }
}
class RunnaleImp330 implements Runnable{
    public void run () {
        System.out.println(Thread.currentThread().getName() + " begins work");
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}