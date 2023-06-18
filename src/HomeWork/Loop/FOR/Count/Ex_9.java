package HomeWork.Loop.FOR.Count;

import java.util.Scanner;

public class Ex_9 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число Х
    и выводит на экран все его делители (1 и само число Х не считать делителями).
Класс должен также подсчитать количество этих делителей и вывести
результат на экран вместе с соответствующим по смыслу текстовым
сообщением.
     */

    public static Scanner sc = new Scanner(System.in);
    public static int scanner = sc.nextInt();

    public static void main(String[] args) {
        System.out.println("Вы ввели число " + scanner + ". Делители: ");


        int count = 0;
        for (int i = 2; i < scanner; i++ ) {
            if (scanner % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n Количество делителей " + count);
    }
}
