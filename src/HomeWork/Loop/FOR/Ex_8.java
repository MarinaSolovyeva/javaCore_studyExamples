package HomeWork.Loop.FOR;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_8 {
    /*
    Напишите класс, который генерирует 5 целых положительных трехзначных чисел
    и выводит на экран порядковый номер числа, сумма
цифр которого была максимальной.
     */

    public static void main(String[] args) {
        int number = 0;
        int index = 0;
        int maxSum = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num = ThreadLocalRandom.current().nextInt(100, 999 + 1);
            list.add(num);

            char[] chars = String.valueOf(num).toCharArray();
            int sum = ((chars[0]- '0') + (chars[1]- '0') + (chars[2]- '0'));
            if (sum > maxSum) {
                maxSum = sum;
                number = num;
            }
        }
        System.out.print(list);

        System.out.println("\n Число " + number + " с порядковым номером " + (list.indexOf(number) + 1));
        System.out.println("\n" + maxSum );
    }
}
