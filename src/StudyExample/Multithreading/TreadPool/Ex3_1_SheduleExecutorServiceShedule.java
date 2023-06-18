package StudyExample.Multithreading.TreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex3_1_SheduleExecutorServiceShedule {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(new RunnaleImp200(),3, TimeUnit.SECONDS);
        //метод schedule выполнит наши таски через определенный период времени, то есть мы гооврит executor service - выполни
        //это задание через три секунды
        scheduledExecutorService.shutdown();
    }
}
class RunnaleImp200 implements Runnable{
    public void run () {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}