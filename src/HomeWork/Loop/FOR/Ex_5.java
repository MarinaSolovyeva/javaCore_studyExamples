package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_5 {
    /* Напишите класс, который принимает с клавиатуры двузначное положительное целое число Х,
    составленное из разных цифр, и возвращает сумму однозначных чисел, заключенных между цифрами этого числа Х
Например, и для числа 52, и для числа 25 будет возвращено значение 14 (2 + 3 + 4 + 5 = 14) */
    static int num = new Scanner(System.in).nextInt();

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        int sum = 0;

        if (num / 10 < num % 10) {min = num / 10;
            max = num % 10;} else {min = num % 10; max = num / 10;}

        for (int i  = min; i <= max; i ++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
