package HomeWork.Loop.While;

import java.util.Scanner;

public class Ex_1 {
    /*
    Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 999.
Класс должен подсчитать, сколько значений было введено с клавиатуры (не считая значения 999), и
вывести эту информацию на экран */
    public static Scanner sc = new Scanner(System.in);

    public static void findNum() {
        int countTry = 0;

        System.out.println("Введите число");
        int num = sc.nextInt();

        while (num != 999) {
            System.out.println("Вы не угадали, повторите попытку\n");
            countTry++;
            num=sc.nextInt();
        }
        System.out.println("Вы угадали число с попытки № " + (countTry + 1));
    }

    public static void main(String[] args) {
        findNum();
    }
}