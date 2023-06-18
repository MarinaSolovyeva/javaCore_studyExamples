package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_12 {
    /*
    Напишите класс, который принимает с клавиатуры два целых положительных числа:
     N и М (неизвестно, какое из введенных чисел больше).
Класс должен вывести на экран все четные числа между наименьшим и
наибольшим значениями, введенными с клавиатуры.
     */

    public static Scanner sc = new Scanner(System.in);
    static int num1 = sc.nextInt();
    static int num2 = sc.nextInt();

    public static void main(String[] args) {
        int min, max;
        if (num1 > num2) {
            max = num1; min = num2;}
        else {
            min = num1; max = num2;}

        for (int i = min + 1; i < max; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
    }
}
