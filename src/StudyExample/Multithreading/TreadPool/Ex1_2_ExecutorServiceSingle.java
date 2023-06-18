package StudyExample.Multithreading.TreadPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Ex1_2_ExecutorServiceSingle {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //всю работу осуществляет единственный Thread

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnaleImp100());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends");
        List <Integer> list = new ArrayList<>(List.of(1,3,4,5));
    }
}

class RunnaleImp101 implements Runnable{
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