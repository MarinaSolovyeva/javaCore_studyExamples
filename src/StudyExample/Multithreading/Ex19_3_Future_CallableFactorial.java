package StudyExample.Multithreading;

import java.util.concurrent.*;

public class Ex19_3_Future_CallableFactorial {
    static int factorialResult2;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial3 factorial3 = new Factorial3(6);
        Future<Integer> future3 = executorService.submit(factorial3);
        /*
        Когда мы делаем сабмит и он нам возвращает future результат работы нашего таска во фьючер его нет, он будет в
        будущем,когда таск полностью выполнится. когда мы пытаемся вытащить из future результат нашего таска,используя метод get,
        а таск еще не закончил работу, наш тред , который вызвал get, будет заблокирован до тех пор, пока таск не завершится,
        то есть пока факториал не будет найдет и future не вернет результат
        то есть мы делаем сабмит наш  таск (factorial3), и сразу получаем на выходе объект future. но на самом деле
        в этот момент таск еще не завершился, он еще не закончил свою работу, и мы тут же с помощью метода Get
        хотим узнать что наш таск вернул, какой результат. Метод get заблокирует поток в котором он был вызван (то есть main)
        до тех пор пока таск не завершит работу и фьючер не сможет вернуть результат нашего таска

         */
        try {
            //с помощью метода Future isDone можем проверить, завершен ли наш таск
            System.out.println(future3.isDone());//false
            System.out.println("Получаем результат");
            factorialResult2 = future3.get();
            System.out.println("Получили результат");
            System.out.println(future3.isDone());//true
        } catch (InterruptedException e) {
            e.getStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();

        System.out.println(factorialResult2);
        /* почему здесь не надо вызывать Await Termination - когда мы дойдем до 34 строки, переменная factorialResult2
        уже будет хранить значение, которое мы передаем в этой строчке кода
         */

            
    }
}}

class Factorial3 implements Callable<Integer> {
    int f;

    public Factorial3(int f) {
        this.f = f;
    }

    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}