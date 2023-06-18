package HomeWork.Loop;

import java.util.Scanner;

public class Ex_7 {
    /*
    Напишите класс, который выводит на экран целые положительные
трехзначные числа после числа, введенного на экран, составленные целиком из четных цифр.
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();

    public static void main(String[] args) {
        for (int i = num + 1; i < 1000; i ++) {
            int i1 = num / 100;
            int i2 = num / 10;
            int i3 = num % 10;
            if (i1 % 2 == 0 && i2 % 2 == 0 && i3 % 2 == 0){
                System.out.println(i + " ");
            }




        }

    }
}
