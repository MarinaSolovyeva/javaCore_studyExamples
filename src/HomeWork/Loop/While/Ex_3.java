package HomeWork.Loop.While;

import java.util.Scanner;

public class Ex_3 {
    /*
    Напишите класс, который принимает с клавиатуры значения, пока их
сумма остается меньше 150. По окончании ввода следует вывести на
экран информацию о количестве введенных значений и их сумме.
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        while (sum < 150) {
            int i = sc.nextInt();
            sum += i;
            count++;
        }
        System.out.println("Вы ввели " + (count) + " значений. Их сумма составляет " + sum);
    }
}

