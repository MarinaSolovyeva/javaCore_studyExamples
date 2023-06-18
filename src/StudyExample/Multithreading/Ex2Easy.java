package StudyExample.Multithreading;

public class Ex2Easy extends Thread {
    //более простое написание примера 2, хоть и не столь читабельное
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);}}

    public static void main(String[] args) {
        Ex2Easy thread1 = new Ex2Easy();
        thread1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);}}}