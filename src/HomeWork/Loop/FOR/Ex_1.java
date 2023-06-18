package HomeWork.Loop.FOR;

import java.util.concurrent.ThreadLocalRandom;

public class Ex_1 {
    /*
    Напишите класс, который генерирует серию из 20 случайных положительных
    двузначных чисел и определяет сумму значений в серии.
     */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 20; i ++ ) {
            int random = ThreadLocalRandom.current().nextInt(10, 100);
            sum += random;
            System.out.print(random + " ");
        }
        System.out.println("\n Сумма чисел равна " + sum);
    }
}

