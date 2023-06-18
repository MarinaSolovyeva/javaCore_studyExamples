package StudyExample.Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;
//пример: есть две будки, значит звонить могут одновременно только 2 человека

public class Ex20_1_Semaphor {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(4);

        new Person("Marina", callBox);
        new Person("Denis", callBox);
        new Person("Anna", callBox);
        new Person("Kristina", callBox);
        new Person("Mike", callBox);
    }
}

class Person extends Thread {
    //кажд человек будет потоком
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();//пусть при создании person этот тред сразу запускается
    }

    public void run() {
        try {
            System.out.println(name+ " ждет");
            callBox.acquire();/*выбрасывает exception. предназначен для попытки получить разрешение от Симафора
           acquire заблокирует поток, пока ресурс не будет для нас доступен . после доступности получаем разрешение
           использовать общий ресурс и каунтер симафора уменьшается на единицу*/
            System.out.println(name +" пользуется телефоном");
            sleep(6000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally{
            callBox.release();/* обазательно в finally должны на симафоре вызвать метод release - мы освобождаем разрешение
            у симафора , тем самым counter у симафора увеличивается на единицу, и этот релиз всегда нужно использовать
            в блоке finally, ведь если выбросится exception и работа потока прервется , нам необходимо освободить доступ
            к ресурсу
            */
        }
    }

}