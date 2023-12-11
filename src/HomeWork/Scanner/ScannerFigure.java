package HomeWork.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerFigure {

    //Консольное приложение. Запрашивает размер фигуры и рисует (звёздочками)
    //1. Квадрат
    //2. Квадратную рамку
    //3. Треугольник заполненный
    //4. Треугольник
    //5. Песочные часы
    //6. Букву Х
    //
    //Ввод с клавиатуры можно опустить. Напишите код типа
    //        // 09:55
    //        Scanner xKeyboard = new Scanner(System.in);
    //        Integer iSize = 11;
    //        while(iSize == null)
    //        {
    //            System.out.print("Enter a size: ");
    //            try
    //            {
    //                iSize = xKeyboard.nextInt();
    //            }
    //            catch(Exception e) {System.out.print("Wrong number. ");}
    //        }
    //        // 09:58
    //        System.out.println("square");
    //...
    //        // 09:59
    //        System.out.println("frame");
    //...
    //        // 10:02
    //        System.out.println("triangle filled");
    //...
    //        // 10:08
    //        System.out.println("triangle framed");
    //...
    //
    //в комментарии пишете время, во сколько начали новый блок. На моё время не смотрите, я-то уже не в первый раз делаю, но задачки простые...
    //Ожидаемый результат на выводе типа такого
    public static Scanner in = new Scanner(System.in);


    public static void printFigure (int size, char letter) {

    }
    public static void printSqr (int size, char letter){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letter + "  ");
            }
            System.out.println();
        }
    }

    private static void printSqrBorder(int size, char letter) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printTriangle(int size, char letter) {
        int spaces = size - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
        }
    }

    private static void printTriangleBorder(int size, char letter) {
        int spaces = size - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i * 2 - 1; j++) {
                if (i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 0) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
        }
    }



    private static void printSandGlass(int size, char letter) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j && i + j <= size - 1 || i >= j && i + j >= size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printLetterX(int size, char letter) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 0;

        while (true) {
            try {
                System.out.println("Введите размер фигуры: ");
                size = in.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Размер должен быть больше 0. Повторите ввод.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
                in.next();
            }
        }
        char letter = '*';

        System.out.println("Draw of Square: start time 18:25");
        printSqr(size, letter);
        System.out.println("Draw of Square Border: start time 18:33");
        printSqrBorder(size, letter);
        System.out.println("Draw of Triangle: start time 18:40");
        printTriangle(size, letter);
        System.out.println("Draw of Triangle Border: start time 18:55");
        printTriangleBorder(size, letter);
        System.out.println("Draw of Sand Glass: start time 19:10");
        printSandGlass(size, letter);
        System.out.println("Draw of Letter X: start time 19:15");
        printLetterX(size, letter);
        System.out.println("Finish time 19:17");
    }
}
