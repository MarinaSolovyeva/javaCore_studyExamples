package HomeWork.Scanner.NumbersScanner;

import java.util.Scanner;

public class Ex_7 {
    /*
    Напишите класс, который принимает с клавиатуры два числа: первое -
количество учеников в классе, второе - количество стульев в классной комнате.
Программа проверит соответствие между этими двумя значениями и
выведет на экран соответствующую информацию (например, для значений 35 и 39 на экран выводится 4 стула лишних)
     */

    public static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        int students = in.nextInt();
        int chairs = in.nextInt();
        int difference = Math.abs(students - chairs);

        if (students > chairs) {
            System.out.println("Не хватает " + difference + " стульев ");
        } else {
            System.out.println(difference + " стула лишних");
        }
    }
}
