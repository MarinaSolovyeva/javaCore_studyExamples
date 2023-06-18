package HomeWork.Loop.While;

import java.util.Scanner;

public class Ex_4_1 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число.
Класс должен заменить его на сумму его же цифр и продолжать эту замену до тех пор,
пока не получится однозначное число. Все получающиеся значения следует вывести на экран
     */

public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num =sc.nextInt();
        int sum = (num / 10) + (num % 10);
        System.out.println("___");
        System.out.println(sum + " ");
        System.out.println("___");
        while (sum >= 10) {
            int newSum = (sum / 10) + (sum % 10);
            System.out.println(newSum + " ");
            System.out.println("___");
            sum = newSum;
        }
    }
}

