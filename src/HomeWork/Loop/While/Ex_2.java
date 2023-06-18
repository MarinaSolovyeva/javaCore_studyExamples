package HomeWork.Loop.While;

import java.util.Scanner;

public class Ex_2 {
    /*
    Напишите класс, который принимает с клавиатуры числа, пока небудет введено значение 999.
Класс должен подсчитать, сколько значений было введено с клавиатуры, чему равна сумма этих значений
(не считая значения 999), и вывести эту информацию на экран.
     */
    public static Scanner sc = new Scanner(System.in);

    public static void findNum() {
        int countTry = 0;
        int countSum = 0;

        System.out.println("Введите число");
        int num = sc.nextInt();

        while (num != 999) {
            System.out.println("Вы не угадали, повторите попытку\n");
            countTry++;
            countSum += num;
            num=sc.nextInt();
        }
        System.out.println("Вы угадали число с попытки № " + (countTry + 1) + ". Сумма неверно введенных " +
                "значений равна " + countSum);
    }

    public static void main(String[] args) {
        findNum();
    }
}

