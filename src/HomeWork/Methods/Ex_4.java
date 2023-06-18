package HomeWork.Methods;

import java.util.Scanner;

public class Ex_4 {
    /*
    Напишите метод, который принимает в качестве параметра целое число
    и возвращает самую большую цифру в этом числе.
     */

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int value = maxValue(num);
        System.out.println(value);
    }

    public static int maxValue (int num) {
        int maxValue = 0;
        int i = 0;

        while (num > 10) {
            i = num % 10;
            if (i > maxValue) {
                maxValue = i;
            }
            num = num / 10;
        }

        if (i > maxValue ) {maxValue = i;}
        return maxValue;
    }
}
