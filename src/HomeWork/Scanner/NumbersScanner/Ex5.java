package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex5 {
    /* Написать класс который принимает трехзначное число и выводит сумму его чисел */

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num =in.nextInt();
        int i1 = num / 100;
        int i2 = num % 100 /10;
        int i3 = num % 10;

        int sumNum = i1 + i2 + i3;

        System.out.println(sumNum);

    }
}
