package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1_1_2 {
    /*
    Класс принимает 6 целых чисел и выводит инфо о том, сколько из них были четными
     */
    public static Scanner sc = new Scanner(System.in);
    static int count;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);

        for (int i : list) {
            if (i %2 == 0 ) {
                count++;}}
        System.out.println("Счетчик четных цифр равен " + count );
    }
}
