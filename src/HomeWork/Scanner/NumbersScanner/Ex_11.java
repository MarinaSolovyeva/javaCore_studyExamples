package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex_11 {
    /* Напишите класс, который принимает с клавиатуры промежуток времени, выраженный в секундах, и
    выводит на экран его же, но выраженный в минутах и секундах. Если промежуток времени превышает час,
    то надо не производить пересчет, а просто вывести на экран текстовое сообщение Расчет не производится. */

    static int second;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int second = in.nextInt();

        if (second > 360) {
            System.out.println("Рассчет не производится");
        } else {
            System.out.println(second / 60 + " : " + second % 60);
        }
    }
}
