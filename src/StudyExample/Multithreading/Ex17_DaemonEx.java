package StudyExample.Multithreading;

public class Ex17_DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread =new UserThread();
        userThread.setName("User_Thread");
        DaemonThread daemonThread =new DaemonThread();
        daemonThread.setName("User_Thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}
class UserThread extends Thread {
    public void run () {
        System.out.println(Thread.currentThread().getName() + " is daemon" + isDaemon());
        for (char i ='A'; i<='J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run () {
        System.out.println(Thread.currentThread().getName() + " is daemon" + isDaemon());
        for (int i =1; i<=1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}