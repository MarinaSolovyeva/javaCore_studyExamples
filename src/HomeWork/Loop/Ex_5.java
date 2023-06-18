package HomeWork.Loop;

import java.util.Scanner;

public class Ex_5 {
    /*
    Принимает с клавиатуры целое число и выводит 10 следующих нечетных значений
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();
    static int count = 0;
    static int i;

    public static void main(String[] args) {

        if (num % 2 == 0) {
            for (int i = num + 1; count < 10; i = i + 2) {
                System.out.print(i + " ");
                count++;
            }
        } else {
            for (int i = num + 2; count < 10; i = i + 2) {
                System.out.print(i + " ");
                count++;

            }
        }
    }
}