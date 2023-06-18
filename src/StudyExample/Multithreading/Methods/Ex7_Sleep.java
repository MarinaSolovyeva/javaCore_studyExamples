package StudyExample.Multithreading.Methods;

public class Ex7_Sleep {
    public static void main(String[] args) throws InterruptedException{ //Прерванное исключение
        for (int i = 5; i>0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Run");
    }
}
