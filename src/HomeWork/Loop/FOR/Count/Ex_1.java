package HomeWork.Loop.FOR.Count;

import java.util.Scanner;

public class Ex_1 {
    /*
    Класс принимает 6 целых чисел и выводит инфо о том, сколько из них были четными
     */
    public static Scanner sc = new Scanner(System.in);
    static int count;

    public static void main(String[] args) {
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int i4 = sc.nextInt();
        int i5 = sc.nextInt();
        int i6 = sc.nextInt();
        int [] array = {i1, i2, i3, i4, i5, i6};

        for (int i : array) {
            if (i %2 == 0 ) {
                count++;}}
        System.out.println("Счетчик четных цифр равен " + count );
    }
}
