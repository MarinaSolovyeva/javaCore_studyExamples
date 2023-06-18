package StudyExample.Multithreading;

public class Ex12_DataRace {
    static final Object lock= new Object ();
    //лучше не испольховать выдуманный класс. невозможно синхронизировать конструктор


    // нам могут звонить на тлф, вотсап и скайп,, есть три потока, если мы уже разговариваем,
    // и нам приходит звонок с другого канала, он будет ждать, пока закончится текущий
    void mobileCall() {
        synchronized (lock){
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mobile call ends");
    }}

     void skypeCall()  {
         synchronized (lock){
        System.out.println("skypeCall call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("skypeCall call ends");
    }}

    void whatsUpCall()  {
        synchronized (lock){
        System.out.println("whatsUpCall call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("whatsUpCall call ends");
    }}

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RMobile());
        Thread thread2 = new Thread(new RSkypeCall());
        Thread thread3 = new Thread(new RWhatsUp());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RMobile implements Runnable {
    public void run () {
        new Ex12_DataRace().mobileCall();}}

class RSkypeCall implements Runnable {
    public void run () {
        new Ex12_DataRace().skypeCall();}}

class RWhatsUp implements Runnable {
    public void run () {
        new Ex12_DataRace().whatsUpCall();}}


// очередность может конечно меняться, какой звонок начнется первым