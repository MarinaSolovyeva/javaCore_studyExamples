package HomeWork.Loop.FOR.Count;
import java.util.Scanner;
public class Ex_10 {
    /* Класс принимает число и проверяет, является ли оно простым*/

    public static Scanner sc = new Scanner(System.in);
    public static int num = sc.nextInt();

    public static boolean isEven () {
        for (int i = 2; i < num; i++) {
            if (num != i && num % i == 0) {
                System.out.println("Число не простое");
                return false;
            }
            else {continue;}
        }
        System.out.println("Число простое");
        return true;
    }

    public static void main(String[] args) {
        isEven();
    }
}
