package HomeWork.Maths;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_8 {
    /*
    Напишите класс, который генерирует и выводит на экран 3 случайных
целых положительных трехзначных числа. Затем класс должен определить разницу между
наибольшим и наименьшим из сгенерированных чисел и вывести ее на экран вместе с
соответствующим текстовым сообщением.
     */

    public static void main(String[] args) {
        int i1 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        int i2 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        int i3 = ThreadLocalRandom.current().nextInt(100, 999 + 1);

        System.out.println("Сгенерированы числа " + i1 + " " + i2 +" "+ i3);

        int  [] array = {i1, i2, i3};

        Arrays.sort(array);
        int difference = array[2] - array[0];
        System.out.println("Разница равна " + difference);
    }
}
