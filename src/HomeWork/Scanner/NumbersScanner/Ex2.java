package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex2 {
    /*Напишите класс который принимает целое положительное трехзначное число и выводит цифры в обратном порядке*/

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int x1 = x/100;
        int x2 = (x%100)/10;
        int x3 = x%10;
        System.out.println(x3 + " " + x2 + " "+ x1);
    }
}
