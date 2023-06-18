package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_6 {
    /*
    По правилам банка, на вклад ежемесячно начисляется определенная
сумма, которая зависит от ежемесячного процента на вклад.
Например, на вкладе в 10000 рублей с месячным процентом 10% через
месяц будет сумма 11000 рублей (1000 плюс 10% от 1000), а еще через
месяц - 12100 (11000 плюс 10% от 11000).
Напишите класс, который принимает с клавиатуры три значения:
• сумму на вкладе;
• месячный процент;
• количество месяцев, в течение которых начисляются проценты на
вклад.
Класс подсчитает и выведет на экран итоговую сумму на вкладе.
     */

    public static void main(String[] args) {
        double sum = new Scanner(System.in).nextInt();
        double percent = new Scanner(System.in).nextInt();
        int month = new Scanner(System.in).nextInt();

        int finalSum = (int) (Math.pow(1 + percent/100, month) * sum);

        System.out.println(finalSum);

    }
}
