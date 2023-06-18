package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_3 {
    /*
    Напишите класс, который принимает с клавиатуры положительноецелое число и выводит на экран все его делители.
    Кроме того, класс должен определять количество и сумму делителей и выводить результаты на экран.
     */

    public static Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    public static void main(String[] args) {
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i ++ ){
            if (num % i == 0) {
                count++;
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Количество делителей равно " + count +
                "\n Сумма делителей равна " + sum);
    }
}
