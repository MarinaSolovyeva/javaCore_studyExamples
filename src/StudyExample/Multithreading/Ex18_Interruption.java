package StudyExample.Multithreading;

public class Ex18_Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
// поток мэйн хочет прервать поток тред.
    }
}
class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run () {
        //считаем сумму корней всех чисел от 1 до 1_000_000_000
        for (int i = 0; i<= 1_000_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Состояние потоков нормальное и мы хотим завершить работу");
                return;
            }
            sqrtSum+=Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
