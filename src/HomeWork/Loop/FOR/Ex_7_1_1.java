package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_7_1_1 {
    /*
выводим трехзначные числа, больше того, что получили с экрана.
проиведение первой и третьей цифры должно на выходе выдавать более 70
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();


    public static void main(String[] args) {
        for (int i = num + 1; i < 1000; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            if ((chars[0] - '0') * (chars[2] - '0') > 70) {
                System.out.print(i + " ");
            }
        }
    }
}