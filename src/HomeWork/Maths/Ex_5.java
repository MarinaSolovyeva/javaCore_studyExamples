package HomeWork.Maths;

import java.util.Scanner;

public class Ex_5 {

    /*
    Напишите класс, который принимает с клавиатуры целое число и затем
генерирует («придумывает>>) случайное число из следующего диапазона:
• «центром диапазона» является введенное с клавиатуры число;
• количество чисел в диапазоне равно 11.
Класс должен определять, «угадал» ли компьютер введенное число и
выводить на экран одно из сообщений (в зависимости от соотношения
введенного и «придуманного» чисел):
• угадал - если числа совпали;
• слишком большое - если «придуманное» компьютером число
больше введенного с клавиатуры;
• слишком маленькое - если «придуманное» компьютером число
меньше введенного с клавиатуры. */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeracy = sc.nextInt();

        int min = numeracy - 5;
        int max = numeracy + 5;

        int random = min + (int) Math.random() * (max - min + 1);

        System.out.println("Введенное число равно " + random);

        if (random == numeracy) {
            System.out.println("Вы угадали");
        } else if (random > numeracy) {
            System.out.println("Слишком большое ");
        } else {
            System.out.println("Слишком маленькое ");
        }
    }
}
