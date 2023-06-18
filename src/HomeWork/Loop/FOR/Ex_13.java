package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_13 {
    /*
    Класс принимает N, а затем выводит все степени 2 от 1 до N
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();


    public static void main(String[] args) {
        for (int i = 1; i < num; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2 в степени " + i + " " + result);
        }
    }
}
