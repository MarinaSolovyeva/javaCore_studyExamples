package StudyExample.ConditionalOperator;

import java.util.Scanner;

public class IF_EvenOdd {
//алгоритм, в котором вводим число на консоль, а нам  - число четное
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите число");

        int number = new Scanner(System.in).nextInt();

        if (number %2 == 0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
}


}
