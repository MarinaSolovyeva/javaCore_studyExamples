package HomeWork.Loop.FOR;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_7_1 {
    /*
    Напишите класс, который генерирует серию из 50 случайных целых
чисел из диапазона от -40 до +40, и определяет наибольшее и наименьшее значение в сгенерированной серии.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = 0;
        int max = 0;
        for (int i = 0; i < 20; i++) {
            int num = ThreadLocalRandom.current().nextInt(-40, 40 + 1);
            list.add(num);
            if (num < min) { min = num;
            }
            if (num > max) { max = num;
            }
        }
        System.out.print(list);
        System.out.println(min);
        System.out.println(max);
    }
}
