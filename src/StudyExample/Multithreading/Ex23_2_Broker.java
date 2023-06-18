package StudyExample.Multithreading;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Ex23_2_Broker extends Thread {
    private static Market market;
    private static final int PAUSE_IN_MILLIS = 500;
    public static void initMarket(Market market) {
        Ex23_2_Broker.market = market;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                TimeUnit.MILLISECONDS.sleep(PAUSE_IN_MILLIS);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Market extends Thread {
    private AtomicLong index;
    private Random generator = new Random();
    public Market(AtomicLong index) {
        this.index = index;
    }
    public AtomicLong getIndex() {
        return index;
    }
    @Override
    public void run() {
        try {
            while (true) {
                index.addAndGet(generator.nextInt(21) - 10);
                Thread.sleep(generator.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AtomicMain {
    private static final int NUMBER_BROKERS = 30;
    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        Ex23_2_Broker.initMarket(market);
        market.start();
        for (int i = 0; i < NUMBER_BROKERS; i++) {
            new Ex23_2_Broker().start();
        }
    }
}

