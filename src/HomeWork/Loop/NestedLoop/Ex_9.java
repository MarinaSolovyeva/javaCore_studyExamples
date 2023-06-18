package HomeWork.Loop.NestedLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_9 {
    /*
    Класс читает целые положительные числа. И выводит на экран количество цифр в числе, сумму цифр числа,
    и количество делителей (с их перечислением)

    Также класс должен посчитать сумму введенных цифр и посчитать их сумму
     */

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> deviders = new ArrayList<>();

        int count = 0;
        int sum = 0;


        int num = new Scanner(System.in).nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                deviders.add(i);
            }
        }
        System.out.println("\nДелители числа " + num + ": " + deviders);


        while (num > 10) {
            al.add(num % 10);
            num = num / 10;
            count++;
        }

        al.add(num);
        Collections.reverse(al);
        count++;
        System.out.println("Число состоит из " + count + " цифр: " + al);


    }
}
