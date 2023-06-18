package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex2_2 {
    /*Напишите класс который принимает целое положительное трехзначное число и выводит цифры в обратном порядке*/

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = in.nextInt();
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            {
                System.out.print(chars[i] + " ");
            }
        }

    }
}

