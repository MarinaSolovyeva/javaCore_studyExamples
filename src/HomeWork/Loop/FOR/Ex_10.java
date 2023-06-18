package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_10 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное
число N и выводит на экран серию 1+2+3+ ... +N, то есть серию целых положительных последовательных чисел,
начиная с 1 и до введенного с клавиатуры значения (числа при выводе на экран должны разделяться знаком + ).
     */

    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();

    public static void main(String[] args) {

        for (int i = 1; i < num; i++) {
            System.out.print(i + " + ");
        }
        System.out.println(num);
    }
}