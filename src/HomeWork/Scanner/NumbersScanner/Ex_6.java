package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex_6 {
    /*
    Нужно посчитать, сколько в числе четных цифр
     */
    public static Scanner sc = new Scanner(System.in);
    static int count;

    public static void main(String[] args) {
        int num = sc.nextInt();
        char [] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i%2 == 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
