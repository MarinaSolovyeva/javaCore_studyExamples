package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex3 {
    /* Напишите класс который выводит на экран в полном виде: 364 это 300 + 60 + 4 */

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int num = in.nextInt();
        int i1 = num/100*100;
        int i2 = num%100/10*10;
        int i3 = num%10;

        System.out.println(num + " = " + i1 + " + " + i2 + " + " + i3);
    }
}
