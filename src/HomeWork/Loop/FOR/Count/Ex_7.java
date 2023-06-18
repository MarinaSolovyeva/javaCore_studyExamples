package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex_7 {
    /*  подбросил монету сначала 10, потом 100, потом 1000 раз. В каждой
серии он записывал, сколько раз выпадала «решка», сколько - «орел».
Напишите класс, который моделирует эти три серии и для каждой подсчитывает количество выпадений «орла» и
количество выпадений «решки», и выводит на экран абсолютное и относительное значение
разницы между этими количествами. */

    public static int countEagle;
    public static int countTails;

    public static List <String> list = new ArrayList<>();

    public static void throwCoin (int t) {
        countEagle = 0;
        countTails = 0;
        for (int i = 0; i < t; i++) {
            Random random = new Random();
            int randomitem = random.nextInt(list.size());
            String randomElement = list.get(randomitem);
            if (randomElement.equals("Eagle")) {countEagle++;}
            else countTails++;
        }
        System.out.println("Монетку подросили " + t + " раз, результат :");
        System.out.println("Орел выпал " + countEagle + " раз");
        System.out.println("Решка выпала " + countTails + " раз");
        System.out.println("____________________________");
    }


    public static void main(String[] args) {
        list.add("Eagle");
        list.add("Tails");

        throwCoin (10);
    }
}
