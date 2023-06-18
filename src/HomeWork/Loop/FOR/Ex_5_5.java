package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_5_5 {
    /*
    Принимает с клавиатуры целое число и выводит 10 следующих нечетных значений
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();
    static int count;
    static int i;

    public static void main(String[] args) {

        if (num % 2 == 0) {
            i = num + 1;
        } else {
            i = num + 2;
        }

        for (int j = i; count < 10; j = j + 2) {
            System.out.print(j + " ");
            count++;
        }
    }
}