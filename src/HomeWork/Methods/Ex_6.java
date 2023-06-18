package HomeWork.Methods;

import java.util.Scanner;

public class Ex_6 {
    /*
Напишите метод, который принимает в качестве параметра два целых
числа и возвращает среднее арифметическое сумм цифр в этих числах.  */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        double avrSum = avrSum(i1,i2);
        System.out.println(avrSum);
    }

    public static double avrSum (int i1, int i2) {
        int sum = 0;

        int i = Integer.parseInt(String.valueOf(i1).concat(String.valueOf(i2)));

        while (i > 0) {
            sum = sum + i % 10;
            i = i / 10;}
        System.out.println(sum);

        double avrSum = (double) sum / 2;
        return avrSum;
    }
}
