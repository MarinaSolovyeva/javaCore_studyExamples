package HomeWork.Loop.While;

import java.util.Scanner;

public class Ex_6 {
    /*
    В лифт может зайти
    Не более 6 человек или не более 450 кг.
Напишите класс, который принимает с клавиатуры значения, каждое
из которых - вес очередного человека, входящего в лифт. Ввод данных
продолжается до тех пор, пока соблюдается требование, указанное в
инструкции.
Класс должен выводить на экран следующую итоговую информацию:
• количество людей, вошедших в лифт;
• общий их вес;
• причина, по которой прекращен вход людей в лифт.
     */

    public static void main(String[] args) {
        int sumWeight = 0;

        OUTER:
        for (int count = 1; count <= 6; count++) {
            int weight = new Scanner(System.in).nextInt();
            sumWeight += weight;

            INNER:
            while (sumWeight < 450) {
                System.out.println("В лифт зашли " + count + " человек. Ваш общий вес " + sumWeight +
                        ". Еще в лифт может зайти " + (6 - count) + " человек с общим весом " + (450 - sumWeight));
                break INNER;
            }
            if (sumWeight >= 450) {
                System.out.println(" Вы не можете зайти в лифт " +
                        ((sumWeight > 450) ? "Общий вес пассажиров превышает норму" : "Количество превышает норму"));
            }
        }
    }
}