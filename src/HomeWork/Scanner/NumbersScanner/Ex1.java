package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex1 {
    /*
    Напишите класс который принимает с клавиатуры целое положительное двузначное число и выводит на экран его цифры,
    разделенные пробелом
     */

    public static void main(String[] args) {
        System.out.println("Введите число");

        int number = new Scanner(System.in).nextInt();
        char[] chars = String.valueOf(number).toCharArray();
        char numerac1 = chars[0];
        char numerac2 = chars[1];
        System.out.println(numerac1);
        System.out.println(numerac2);
    }
}


