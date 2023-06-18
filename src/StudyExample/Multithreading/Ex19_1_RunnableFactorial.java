package StudyExample.Multithreading;

import java.util.concurrent.*;

public class Ex19_1_RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        //executorService.execute(factorial);
        /*
        Объект Future возвращается тогда ,когда мы используем метод submit. Также метод сабмит можно использовать с
        интерфейсом Runnable
         */
        Future future= executorService.submit(factorial); //здесь уже не можем использовать Generic, потому что
        //run ничего не возвращает, и будет null
        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);// если мы не попросим мэйн подождать наш поток
        // то мэйн сразу выведен на экран значение factorialresult
        System.out.println(future.get()); // null
        /*
        зачем тогда использовать Future с Runnable -  с его помощью мы можем делать cancel нашего таска, узнавать закончилась
        ли его работа с помощью isDone
         */
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {
    int f;
    public Factorial(int f) {
        this.f = f;
    }

    public void run() {
        if(f<=0){
            System.out.println("Вы ввели неверное число");
            return ;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result*=i;}
        Ex19_1_RunnableFactorial.factorialResult = result;
    }
}