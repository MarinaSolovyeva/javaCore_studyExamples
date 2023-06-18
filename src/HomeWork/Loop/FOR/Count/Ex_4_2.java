package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Ex_4_2 {
    /*
    Класс генерирует 15 целых чисел в интервале от - 15 до 25. нужно вывести на экран , сколько цифр были положительными,
    однозначными, и четными */

    public static int checkCounts(ArrayList<Integer> list, IcheckCounts sc) {
        int count = 0;
        for (int i : list) {
            if (sc.test(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n По вашему запросу было найдено "   + count + " значений");
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int random = ThreadLocalRandom.current().nextInt(-15, 25 + 1);
            list.add(random);}
        System.out.println(list);
        System.out.println("__________________");

        checkCounts(list, i -> i >= 0);
        checkCounts(list, i -> i > -10 && i < 10);
        checkCounts(list, i -> i % 2 == 0);
    }
}

interface IcheckCounts {
    boolean test(int i);}

