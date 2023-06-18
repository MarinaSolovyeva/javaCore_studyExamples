package HomeWork.Loop.NestedLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_9_1 {
    /* Класс читает целые положительные числа. И выводит на экран количество цифр в числе, сумму цифр числа,
    и количество делителей (с их перечислением)
    Также класс должен посчитать сумму введенных цифр и посчитать их сумму */

    ArrayList<Integer> numeric = new ArrayList<>();
    ArrayList<Integer> deviders = new ArrayList<>();

    int countNumbers = 0;
    int countNumeric = 0;
    int totalAmount = 0;

    public void clear() {
        numeric.clear();
        countNumbers = 0;
        deviders.clear();}

    public void info() {
        int num = new Scanner(System.in).nextInt();
        totalAmount += num;
        countNumeric++;
        System.out.println("Вы ввели " + countNumeric + " число. Общая сумма введенных значений " + totalAmount);

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                deviders.add(i);}}

        System.out.println("Делители числа " + num + ": " + deviders);
        while (num > 10) {
            numeric.add(num % 10);
            num = num / 10;
            countNumbers++;}

        numeric.add(num);
        Collections.reverse(numeric);
        countNumbers++;

        System.out.println("Число состоит из " + countNumbers + " цифр: " + numeric);
        System.out.println("_____________");

        clear();
        info();}

    public static void main(String[] args) {
        Ex_9_1 test = new Ex_9_1();
        test.info();
    }
}