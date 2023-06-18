package HomeWork.Loop.FOR;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_7 {
    /* Напишите класс, который генерирует серию из 50 случайных целых
чисел из диапазона от -40 до +40, и определяет наибольшее и наименьшее
значение в сгенерированной серии. */

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int min = 0;
        int max = 0;
        for (int i = 0; i < 50; i ++ ) {
            int num = ThreadLocalRandom.current().nextInt(-40, 40 + 1);
            al.add(num);
            }

        min = al.get(0);
        max = al.get(0);

        for (int j = 0; j < 50; j ++ ) {
            if (min < j) {min = j;}
            if (max > j) {max = j;}
        }

    }
}
