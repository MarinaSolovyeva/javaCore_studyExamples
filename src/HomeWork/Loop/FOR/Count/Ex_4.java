package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_4 {
    /*
    Класс генерирует 15 целых чисел в интервале от - 15 до 25. нужно вывести на экран , сколько цифр были положительными,
    однозначными, и четными
     */
    public static int countPositive;
    public static int countSingle;
    public static int countEven;

    public static void checkPositive(List<Integer> list) {
        for (int i = 0; i < 15; i++) {
            if (list.get(i) >= 0) {
                countPositive++;
            }
        }
        System.out.println("Было введено " + countPositive + " положительных значений");
    }

    public static void checkSingle(List<Integer> list) {
        for (int i = 0; i < 15; i++) {
            if (list.get(i) > -10 && list.get(i) < 10) {
                countSingle++;
            }
        }
        System.out.println("Было введено " + countSingle + " однозначных значений");
    }

    public static void checkEven(List<Integer> list) {
        for (int i = 0; i < 15; i++) {
            if (list.get(i) % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Было введено " + countEven + " четных значений");
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int random = ThreadLocalRandom.current().nextInt(-15, 25 + 1);
            list.add(random);
        }
        System.out.println(list);
        System.out.println("__________________");
        checkPositive(list);
        checkSingle(list);
        checkEven(list);;
    }
}

