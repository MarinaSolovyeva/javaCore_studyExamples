package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex_8 {
    /* Напишите класс, который принимает с клавиатуры положительное число и проверяет,
    составлено ли оно из одинаковых цифр */
    public static Scanner sc = new Scanner(System.in);

    static int num = sc.nextInt();
    static char[] chars = String.valueOf(num).toCharArray();

    public static boolean isSame() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] != chars[j]) {
                    System.out.println("Цифры в числе разные");
                    return false;
                }
            }
        }
        System.out.println("Цифры одинаковые");
        return true;
    }

    public static void main(String[] args) {
        Ex_8.isSame();
    }
}