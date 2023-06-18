package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_11 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число N и
     выводит на экран серию N+(N-l)+(N-2)+ ... + 1, то есть серию целых положительных
     последовательных чисел, начиная с введенного с клавиатуры значения и до 1 (числа при выводе на экран
должны разделяться знаком+).
     */


    public static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();

    public static void main(String[] args) {
        System.out.print(num + "+");
        for (int i = 1; i <= num; i++) {
            System.out.print("(" + num + "-" + i + ")" + "+");
        }
        System.out.println(1);
    }
}
