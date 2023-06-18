package HomeWork.Maths;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Ex_8_1 {
    /*
    Напишите класс, который генерирует и выводит на экран 3 случайных
целых положительных трехзначных числа. Затем класс должен определить разницу между
наибольшим и наименьшим из сгенерированных чисел и вывести ее на экран вместе с
соответствующим текстовым сообщением.
     */

    public static void MaxMin (int [] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {min = array[i];}
            if (max < array[i]) {max = array[i];}
        }
        int difference = max - min;

        System.out.println("Минимальное значение " + min + ", Максимальное значение " + max);
        System.out.println("Разница между ними " + difference);
    }

    public static void main(String[] args) {
        int i1 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        int i2 = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        int i3 = ThreadLocalRandom.current().nextInt(100, 999 + 1);

        System.out.println("Сгенерированы числа " + i1 + " " + i2 +" "+ i3 + "\n");
        int  [] array = {i1, i2, i3};

        Ex_8_1.MaxMin(array);

    }
}
