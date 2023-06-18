package HomeWork.Loop.FOR.Count;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex_4_2_Filter {
    /* Класс генерирует 15 целых чисел в интервале от - 15 до 25. нужно вывести на экран , сколько цифр были положительными,
    однозначными, и четными */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int random = ThreadLocalRandom.current().nextInt(-15, 25 + 1);
            list.add(random);
        }

        System.out.println(list);
        System.out.println("________________");

        Predicate<Integer> filterPositive = e -> e >= 0;
        Predicate<Integer> filterSingle = e -> e > -10 && e < 10;
        Predicate<Integer> filterEven = e -> e % 2 == 0;

        List<Integer> listPositive = list.stream().filter(filterPositive).collect(Collectors.toList());
        List<Integer> listSingle = list.stream().filter(filterSingle).collect(Collectors.toList());
        List<Integer> listEven = list.stream().filter(filterEven).collect(Collectors.toList());
    }
}


