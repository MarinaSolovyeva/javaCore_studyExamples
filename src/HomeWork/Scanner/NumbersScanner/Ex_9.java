package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex_9 {
    /*Проверить, содержит ли число 0 */

    public static Scanner in = new Scanner(System.in);
    static int num = in.nextInt();

    static char[] chars = String.valueOf(num).toCharArray();

    public static boolean checkZero() {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) {
                System.out.println("Число содержит 0");
                return false;
            }
        }
        System.out.println("Число не содержит 0");
        return true;
    }

    public static void main(String[] args) {
        Ex_9.checkZero();
    }
}
