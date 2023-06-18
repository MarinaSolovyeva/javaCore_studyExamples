package HomeWork.Loop;

import java.util.Scanner;

public class Ex_4 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и выводит на экран 5 последующих ему чисел.
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();

    public static void main(String[] args) {

        for (int i = num + 1; i <= num + 5; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
