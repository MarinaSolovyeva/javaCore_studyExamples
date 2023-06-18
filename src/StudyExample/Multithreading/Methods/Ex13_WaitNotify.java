package StudyExample.Multithreading.Methods;

public class Ex13_WaitNotify {
    public static void main(String[] args) {
        Market market = new Market();
        /* Обратить внимание что методы getBread и putBread синхронизированы ,синхонизация по объеку this.
        This - это наш созданный market на 5 строке, поэтому синхронизация по нему. то есть потоки
        синхронизированы по одному и тому же объекту, => одновременно работать они не могут*/
        Producer producer = new Producer(market); // создаем объект продьюсера
        Consumer consumer = new Consumer(market); // создаем объект потребителя

        Thread thread1 = new Thread(new Producer(market));
        Thread thread2 = new Thread(new Consumer(market));
        thread1.start();
        thread2.start();}}

class Market{
    private int breadCount = 0;
    public synchronized void getBread() { //метод которым будет пользоваться Consumer
        while (breadCount<1) { //3. Если же хлеба нет, то поток который вызывает этот метод - ждет и освобождает монитор
            try {wait();//выбрасывает InterruptedException
            } catch (InterruptedException e) {
                e.printStackTrace();}}
        breadCount--; // 1. уменьшает кол-во хлеба на прилавке, выводит сообщение
        System.out.println("Consumer buys one bread");
        System.out.println("leftover bread on the market = " + breadCount);
        notify();// 2. и сообщает проиводителю что количество хлеба уменьшилось, можешь производить хлеб
    }

    public synchronized void putBread() { //метод которым будет пользоваться производитель
        while (breadCount>=5) { //3.если же кол-во хлеба на прилавке 5, мы не можем доложить хлеб
            //и поток вызывающий метод putBread (то есть производитель) , начинает ждать,пока кол-во хлеба уменьшится
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;//1. добавляет хлеб на прилавок и выводит сообщение,
        System.out.println("Producer adds one bread");
        System.out.println("leftover bread on the market = " + breadCount);
        notify();//2. и извещает поток потребителя что хлеб появился , можешь брать
    }
}

class Producer implements Runnable{
    Market market;
    Producer(Market market) {//передаем в конструктор маркет, чтобы они знали с каким магазином работают
        this.market = market;
    }
    public void run () {
        for (int i = 0; i < 10; i++) { //и 10 раз производитель будет производить хлеб
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;
    Consumer(Market market) {
        this.market = market;
    }
    public void run () {
        for (int i = 0; i < 10; i++) {//и 10 раз покупатель будет брать хлеб
            market.getBread();}}}
