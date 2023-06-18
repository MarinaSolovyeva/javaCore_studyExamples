package HomeWork.Methods;

import java.util.Scanner;

public class Ex_2 {
    /*
    Напишите метод, который получает в качестве параметра два числа
(А и В) и выводит на экран все четные числа из диапазона А ... В
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i1, i2, y;

        i1 = sc.nextInt();
        i2 = sc.nextInt();
        method(i1, i2);}

    public static void method (int i1, int i2) {
        int max, min;
        if (i1 > i2) {max = i1; min = i2;}
        else {max = i2; min = i1;}

        for (int i = min + 1; i < max; i ++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
