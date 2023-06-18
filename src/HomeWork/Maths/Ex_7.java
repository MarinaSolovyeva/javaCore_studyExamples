package HomeWork.Maths;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_7 {

    /*
    Напишите класс, который генерирует и выводит на экран два случайных числа из диапазона от 17 до 94.
Класс должен проверить, какое из двух чисел, первое или второе, было
больше, и вывести на экран соответствующее текстовое сообщение.
Кроме того, класс должен определить наименьшую цифру из всех фигурирующих в этих числах
и вывести на экран соответствующее текстовое сообщение
     */

    public static void main(String[] args) {

        int random1 = ThreadLocalRandom.current().nextInt(17, 94 + 1);
        int random2 = ThreadLocalRandom.current().nextInt(17, 94 + 1);

        System.out.println(random1 > random2 ? random1 + " Больше " + random2 : random2 + " Больше " + random1);

        char[] chars1 = String.valueOf(random1).toCharArray();
        char[] chars2 = String.valueOf(random2).toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        char min = chars1[0] < chars2[0] ? chars1[0] : chars2[0];

        System.out.println( "Минимальная цифра " + min);
    }
}
