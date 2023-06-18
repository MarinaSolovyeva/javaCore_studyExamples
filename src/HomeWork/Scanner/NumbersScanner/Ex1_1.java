package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex1_1 {
    /*
    Напишите класс который принимает с клавиатуры целое положительное двузначное число и выводит на экран его цифры,
    разделенные пробелом
     */

    public static void main(String[] args) {
        System.out.println("Введите число");

        int number = new Scanner(System.in).nextInt();
        char[] chars = String.valueOf(number).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            {
                System.out.print(chars[i] + " ");
            }
        }
    }
}

