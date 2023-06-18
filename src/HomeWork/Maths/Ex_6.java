package HomeWork.Maths;
import java.util.concurrent.ThreadLocalRandom;
public class Ex_6 {
    /*
    Напишите класс, который создает и выводит на экран 5 случайных целых чисел, заканчивающихся на ноль,
    и принадлежащих к диапазону двузначных чисел.
     */

    public static void main(String[] args) {


        int num1 = (ThreadLocalRandom.current().nextInt(1, 9 + 1)) * 10;
        int num2 = (ThreadLocalRandom.current().nextInt(1, 9 + 1)) * 10;
        int num3 = (ThreadLocalRandom.current().nextInt(1, 9 + 1)) * 10;
        int num4 = (ThreadLocalRandom.current().nextInt(1, 9 + 1)) * 10;
        int num5 = (ThreadLocalRandom.current().nextInt(1, 9 + 1)) * 10;

        System.out.println(num1 + " " + num2 + " " + num3 + " " +num4 + " " + num5);
    }
}
