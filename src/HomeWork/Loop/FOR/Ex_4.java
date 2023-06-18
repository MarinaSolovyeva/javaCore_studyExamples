package HomeWork.Loop.FOR;

import java.util.Scanner;

public class Ex_4 {
    /*
    Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку класса;
• число учеников, получивших неудовлетворительные оценки.*/
    public static void main(String[] args) {

        int sumGrade = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int grade = new Scanner(System.in).nextInt();
            sumGrade += grade;
            if (grade < 3) {
                count++;}
        }
        int avrGrade = sumGrade / 10;
        System.out.println("Средняя оценка класса " + avrGrade);
        System.out.println("Число учеников с неудовлетворительной оценкой " + count);
    }
}
