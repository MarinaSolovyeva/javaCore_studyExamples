package HomeWork.Loop.NestedLoop;

import java.util.Scanner;

public class Ex_4 {
    /*Напишите класс, который принимает с клавиатуры целое число, а затем проверяет,
    можно ли представить его в виде суммы квадратов двух целых чисел.*/

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();

        OUTER:
        for (int i = 1; i <= num; i++) {

            INNER:
            for (int j = 1; j <= num; j++) {

                int sum = (int) (Math.pow(i, 2) + Math.pow(j, 2));
                if (sum == num) {
                    System.out.println("Число " + num + " можно представить в виде суммы квадратов двух чисел " +
                            i + " и " + j);
                    break OUTER;
                }
            }
            System.out.println("Число " + num + " нельзя представить в виде суммы квадратов двух чисел.");
            break OUTER;
        }
    }
}

