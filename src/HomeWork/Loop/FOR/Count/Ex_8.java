package HomeWork.Loop.FOR.Count;

import java.util.concurrent.ThreadLocalRandom;

public class Ex_8 {
    /*
    Серия случайных чисел называется «уравновешенной», если количество положительных
    и отрицательных чисел в серии - одинаково. Напишите класс, который генерирует
    серию из 30 случайных целых чисел из диапазона от -20 до 20 и проверяет,
    является ли серия «уравновешенной)>.
     */

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 30; i++) {
            int random = ThreadLocalRandom.current().nextInt(-20, 20 + 1);
            System.out.print(random + " ");
            if (random > 0) {
                count++;
            }
        }
        if (count == 15) {
            System.out.println("\n __________");
            System.out.println("Было введено " + count + " положительных чисел из 30. Серия уравновешенная");
        }
        else {System.out.println("\n __________");
            System.out.println(" Было введено " + count + " положительных чисел из 30. Серия неуравновешенная");
        }
    }
}

