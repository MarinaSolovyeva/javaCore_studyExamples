package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_2 {
    /*
    Принимает 5 целых чисел и выводит инфо сколько чисел больше чем первое число*/

    public static Scanner sc = new Scanner(System.in);
    public static int count;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i ++) {
        int num = sc.nextInt();
        list.add(num);}

        System.out.println(list);

        for (int i = 1; i < 5; i ++) {
            if (list.get(i) > list.get(0)) {
                count++;}}
        System.out.println(count + " значения больше 1 числа");
    }
}
