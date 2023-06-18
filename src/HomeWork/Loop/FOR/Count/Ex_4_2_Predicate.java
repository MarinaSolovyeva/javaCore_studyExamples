package HomeWork.Loop.FOR.Count;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class Ex_4_2_Predicate {
    /* Класс генерирует 15 целых чисел в интервале от - 15 до 25. нужно вывести на экран , сколько цифр были положительными,
    однозначными, и четными */

    public static int checkCounts(ArrayList<Integer> list, Predicate<Integer> pr) {
        int count = 0;
        for (int i : list) {
            if (pr.test(i)) {
                count++;
                System.out.print(i + " ");}}
        System.out.println("По вашему запросу было найдено " + count + " значений");
        return count;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int random = ThreadLocalRandom.current().nextInt(-15, 25 + 1);
            list.add(random);}

        System.out.println(list);
        System.out.println("__________________");

        Predicate<Integer> p1 = i -> i >= 0;
        Predicate <Integer> p2 = i -> i > -10 && i < 10;
        Predicate <Integer> p3 = i -> i % 2 == 0;

        checkCounts(list, p1);
        checkCounts(list, p2);
        checkCounts(list, p3);

    }
}


