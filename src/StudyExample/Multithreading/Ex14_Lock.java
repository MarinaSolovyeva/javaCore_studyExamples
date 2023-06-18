package StudyExample.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex14_Lock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsUpCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

    class Call {
        private Lock lock = new ReentrantLock();

        void mobileCall() {
            lock.lock();
            try {
                System.out.println("Mobile call starts");
                Thread.sleep(3000);
                System.out.println("Mobile call ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();//всегда помещается в finally,чтобы если выьрасывался эксепшен ,
                // наш лок открывался в любом случае
            }
        }


        void skypeCall() {
            lock.lock();
            try {
                System.out.println("SkypeCall call starts");
                Thread.sleep(5000);
                System.out.println("SkypeCall call ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        void whatsUpCall() {
            lock.lock();
            try {
                System.out.println("WhatsUpCall call starts");
                Thread.sleep(4000);
                System.out.println("WhatsUpCall call ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }