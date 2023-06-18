package HomeWork.Methods;

import java.util.Scanner;

public class Ex_3 {
    /*
    Напишите метод, который принимает в качестве параметров целое
число и возвращает сумму его цифр.
     */

    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        int sum = sum (num);
        System.out.println(sum);
    }

    public static int sum(int num) {
        int sum = 0;

        while (num > 10) {
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        return sum;
    }
}

