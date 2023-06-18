package StudyExample.Multithreading;

import java.util.concurrent.*;

public class Ex19_2_CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        Future<Integer> future = executorService.submit(factorial2);/*
        Для callable не можем использовать метод Execute, он принимает в параметр Runnable.
        вместо него для callable предназначен метод submit (Разместить)
        но помимо этого он еще возвращает результат таска, а результат integer. этот рехльутат храниться в объекте типа Future
        Future работает с Generics. Получить результат из Future можно с помощью метода Get */
        try {
            factorialResult = future.get(); //get выбрасывает Exception (потому что  call допускает выброс Exception)
        } catch (InterruptedException e) {
            e.getStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
            //с помощью getCause выводим причину по которой был выброшен Exception
            //выводится причина которую мы опишем в call
        } finally {
            executorService.shutdown();
        }//ExecutorService очень хорошо закрывать в Finally Block
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}