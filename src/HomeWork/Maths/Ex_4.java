package HomeWork.Maths;

import java.util.concurrent.ThreadLocalRandom;

public class Ex_4 {
    /*
    Напишите класс, который генерирует случайное положительное двузначное число, а затем генерирует три целых
    положительных числа, меньших первого.
     */

    public static void main(String[] args) {
        int random1 = ThreadLocalRandom.current().nextInt(0, 99 + 1);

        int random2 = ThreadLocalRandom.current().nextInt(0, random1);
        int random3 = ThreadLocalRandom.current().nextInt(0, random1);
        int random4 = ThreadLocalRandom.current().nextInt(0, random1);

        System.out.println(random1 + " : " + random2 + " " + random3 + " " + random4);
    }
}
