package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_3 {
    /* Класс принимает 10 целых чисел, нужно проверить, сколько из них больше , чем предыдущее значение*/
    public static Scanner sc = new Scanner(System.in);
    public static int count;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i ++ ) {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);

        for (int i = 1; i < 10;i++) {
            if (list.get(i) > list.get(i - 1)) {
                count++;}}
        System.out.println("Сколько цифр больше предыдущей? : " + count);
    }
}
