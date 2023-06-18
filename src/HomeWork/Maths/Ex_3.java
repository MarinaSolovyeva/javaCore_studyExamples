package HomeWork.Maths;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Ex_3 {
    /* Напишите класс, который принимает с клавиатуры целое положительное число,
    а затем генерирует три целых положительных числа, меньших первого. */

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int numeracy = sc.nextInt();
        int random1 = ThreadLocalRandom.current().nextInt(0, numeracy);
        int random2 = ThreadLocalRandom.current().nextInt(0, numeracy);
        int random3 = ThreadLocalRandom.current().nextInt(0, numeracy);

        System.out.println(random1 + " , " + random2 + " , " + random3);

    }
}
