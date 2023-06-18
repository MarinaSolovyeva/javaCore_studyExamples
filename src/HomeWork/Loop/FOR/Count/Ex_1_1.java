package HomeWork.Loop.FOR.Count;

import java.util.Scanner;

public class Ex_1_1 {
    /*
    Класс принимает 6 целых чисел и выводит инфо о том, сколько из них были четными
     */
    public static Scanner sc = new Scanner(System.in);
    static int count, x;

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i ++) {
            x = sc.nextInt();

            if (x % 2 == 0 ) {
                count++;}}
        System.out.println("Счетчик четных цифр равен " + count );
    }
}
