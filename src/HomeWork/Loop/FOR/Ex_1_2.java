package HomeWork.Loop.FOR;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_1_2 {
    /*
    Напишите класс, который выполняет следующие действия:
1. Принимает с клавиатуры два целых числа.
2. Создает и выводит на экран 10 случайных чисел в диапазоне от
первого, только что введенного с клавиатуры, значения, - до второго значения, также введенного с клавиатуры перед этим.

НЕ ЗНАЮ, КАКОЕ ЧИСЛО МЕНЬШЕ

Например, если с клавиатуры были введены значения -8 и 17, то класс
создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти
значения).
     */
    public static Scanner sc = new Scanner(System.in);
    static int num1 = sc.nextInt();
    static int num2 = sc.nextInt();


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (num1 < num2) {
                int random = ThreadLocalRandom.current().nextInt(num1, num2 + 1);
                System.out.print(random + " ");
            } else {
                int random = ThreadLocalRandom.current().nextInt(num2, num1 + 1);
                System.out.print(random + " ");
            }
        }
    }
}

