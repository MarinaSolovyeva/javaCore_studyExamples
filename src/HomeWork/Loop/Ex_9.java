package HomeWork.Loop;

import java.util.Scanner;

public class Ex_9 {
    /*
    Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное
число;
• затем выводит на экран (в строку с пробелами) трехзначные целые положительные числа до 500,
в которых предварительно введенное
двузначное число является «внутренней» частью (как, например,
23 для 123 или 623).
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();

    public static void main(String[] args) {
        for (int i = 100; i < 500; i++) {
            char [] chars = String.valueOf(i).toCharArray();
            int i01 = Integer.parseInt(Integer.toString(chars[0] - '0') + Integer.toString(chars[1] - '0'));
            int i12 = Integer.parseInt(Integer.toString(chars[1] - '0') + Integer.toString(chars[2] - '0'));
            if (i01 == num || i12 == num ) {
                System.out.print(i + " ");
            }
        }
    }
}
