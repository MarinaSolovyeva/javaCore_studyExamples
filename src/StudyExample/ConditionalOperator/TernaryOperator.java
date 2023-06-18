package StudyExample.ConditionalOperator;

import java.util.Scanner;

public class TernaryOperator {
    /*Задаётся число - положительное или отрицательное. Программа должна выдавать модуль этого числа.*/

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите число");
        int i = new Scanner(System.in).nextInt();

        System.out.println(i>=0 ? i : i * -1 );
    }
}
