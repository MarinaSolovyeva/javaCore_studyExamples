package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex_7_1 {
    /*  подбросил монету сначала 10, потом 100, потом 1000 раз. В каждой
серии он записывал, сколько раз выпадала «решка», сколько - «орел».
Напишите класс, который моделирует эти три серии и для каждой подсчитывает количество выпадений «орла» и
количество выпадений «решки», и выводит на экран абсолютное и относительное значение
разницы между этими количествами. */

    public static int countEagle;
    public static int countTails;

    public static List <String> list = new ArrayList<>();


    public static void throw10 () {
        countEagle = 0;
        countTails = 0;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            String randomElement = list.get(Math.abs(random.nextInt()) % list.size());
            if (randomElement.equals("Eagle")) {countEagle++;}
            else countTails++;
        }
        System.out.println("Монетку подросили 10 раз, результат :");
        System.out.println("Орел выпал " + countEagle + " раз");
        System.out.println("Решка выпала " + countTails + " раз");
        System.out.println("____________________________");
    }

    public static void throw100 () {
        countEagle = 0;
        countTails = 0;
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            String randomElement = list.get(Math.abs(random.nextInt()) % list.size());

            if (randomElement.equals("Eagle")) {countEagle++;}
            else countTails++;
        }
        System.out.println("Монетку подросили 100 раз, результат :");
        System.out.println("Орел выпал " + countEagle + " раз");
        System.out.println("Решка выпала " + countTails + " раз");
        System.out.println("____________________________");
    }

    public static void throw1000 () {
        countEagle = 0;
        countTails = 0;
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            String randomElement = list.get(Math.abs(random.nextInt()) % list.size());

            if (randomElement.equals("Eagle")) {countEagle++;}
            else countTails++;
        }
        System.out.println("Монетку подросили 1000 раз, результат :");
        System.out.println("Орел выпал " + countEagle + " раз");
        System.out.println("Решка выпала " + countTails + " раз");
        System.out.println("____________________________");
    }


    public static void main(String[] args) {
        list.add("Eagle");
        list.add("Tails");

        throw10();
        throw100();
        throw1000();
    }
}
