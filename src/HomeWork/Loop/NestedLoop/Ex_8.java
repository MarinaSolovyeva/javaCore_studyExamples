package HomeWork.Loop.NestedLoop;

import java.util.ArrayList;

public class Ex_8 {
    /*
    Напишите класс, который выводит на экран все трехзначные числа,
для которых само число заканчивается на О. Вывести нечетные делители этого числа и их сумму
     */

    public static void main(String[] args) {
        for (int i = 100; i < 1_000; i = i + 10) {

            int sum = 0;
            int count = 0;

            System.out.println("\nНечетные делители числа " + i + ", подходящих под условие: ");
            for (int j = 3; j < i; ) {
                if (i % j == 0) {
                    sum += j;
                    System.out.print(j + " ");
                    j = j + 2;
                    count++;
                } else {
                    j = j + 2;
                }
            }

            System.out.println("\nСумма его нечетных делителей : " + sum
                    + ". Колчество его нечетных делителей : " + count);
        }
    }
}


