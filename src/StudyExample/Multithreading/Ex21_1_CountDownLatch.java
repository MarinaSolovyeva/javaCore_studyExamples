package StudyExample.Multithreading;

import java.util.concurrent.CountDownLatch;

public class Ex21_1_CountDownLatch {
    /*Black Friday - люди стоят с самого утра в очереди одни из первых,но не могут приступить к операции покупки пока:
    * - работники не придут на работу
    * - все  должно быть разложено
    * -магазин должен открыться */

    static CountDownLatch countDownLatch = new CountDownLatch(3);// кол-во операций 3

    private static void marketSTaffIsOnPlace () throws InterruptedException {
        Thread.sleep(2000); //ждем пока сотрудники придут на работу
        System.out.println("Сотрудники пришли на работу");
        countDownLatch.countDown();//метод countDown уменьшает счетчик на единицу
        System.out.println("счетчик ="+countDownLatch.getCount()); // с помощью getCount() можем получить значение счетчика
    }

    private static void everythingIsReady () throws InterruptedException {
        Thread.sleep(3000); //ждем пока все разложат на полки
        System.out.println("Все товары разложены на полки");
        countDownLatch.countDown();
        System.out.println("счетчик ="+countDownLatch.getCount());
    }

    private static void openMarket () throws InterruptedException {
        Thread.sleep(5000); //ждем пока откроется магазин
        System.out.println("Магазин открыт");
        countDownLatch.countDown();
        System.out.println("счетчик ="+countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend ("Marina", countDownLatch);
        new Friend ("Denis", countDownLatch);
        new Friend ("Victoria", countDownLatch);
        new Friend ("Alexandra", countDownLatch);
        new Friend ("Mikhail", countDownLatch);

        marketSTaffIsOnPlace();
        everythingIsReady();
        openMarket();

    }
}


class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;
    public Friend (String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run () {
        try {
            countDownLatch.await();//если счетчик больше нуля, наш поток будет заблокирован пока счетчик не станет
            // равным нулю
            System.out.println(name + " приступил к покупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //если счетчик 0, то поток выполняет работу
    }
}
