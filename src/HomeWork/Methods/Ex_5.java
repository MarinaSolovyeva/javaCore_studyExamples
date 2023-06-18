package HomeWork.Methods;

import java.util.Scanner;

public class Ex_5 {
    /*
    Напишите метод, который принимает в качестве параметра два целых
числа и возвращает значение true, если в числах одинаковое количество цифр;
в ином случае метод возвращает значение false.
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(isSameAmount(i1, i2));
    }

    public static boolean isSameAmount(int i1, int i2) {
        int numDigits1 = String.valueOf(i1).length();
        int numDigits2 = String.valueOf(i2).length();
        if (numDigits1 == numDigits2) {
            return true;
        } else return false;
    }
}
