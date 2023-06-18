package HomeWork.Loop.NestedLoop;

import java.util.ArrayList;

public class Ex_8_1 {
    /*Напишите класс, который выводит на экран все трехзначные числа,
для которых соблюдаются два условия:
• само число заканчивается на О;
• сумма нечетных делителей этого числа тоже заканчивается на О. */

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 100; i < 1_000; i = i + 10) {
            al.clear();
            int sum = 0;
            int count = 0;

            for ( int j = 3; j < i; ) {
                if (i % j == 0) {
                    sum += j;
                    al.add(j);
                    j = j + 2;
                    count++;

                } else {
                    j = j + 2;
                }
            }
            if (sum % 10 == 0) {
                System.out.println("\nНечетные делители числа " + i + ", подходящих под условие: " + al);
                System.out.println("\nСумма его нечетных делителей : " + sum
                        + ". Количество его нечетных делителей : " + count);

            }
        }
    }
}

