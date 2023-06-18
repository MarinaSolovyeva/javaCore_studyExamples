package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex4 {
    /* Класс принимает двузначное число, следует построить новое значение из цифр данного числа, но в обратно м порядке.
    Данное знаение увеличить на 8 и оконч результат вывести на экран */

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = in.nextInt();
        int i1 = num / 10;
        int i2 = num % 10;

        int num2 =  i2 * 10 + i1;

        System.out.println(num2);
        System.out.println(num2 + 8);


    }
}
