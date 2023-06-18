package HomeWork.Loop.While;

import java.util.Scanner;

public class Ex_5 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число
    и находит его наименьший делитель, отличный от 1.
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();

        int i = 2;

        while (num % i != 0) {
            i++;
        }
        System.out.println("Вы ввели число " + num + ". Его наименьший делитель " + i);
    }
}

