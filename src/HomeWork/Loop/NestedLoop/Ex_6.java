package HomeWork.Loop.NestedLoop;

public class Ex_6 {
/* Напишите класс, который выводит на экран все простые двузначные
числа, квадрат которых не превышает 999.  */

    public static void main(String[] args) {

        OUTER:
        for (int i = 10; i < 100; i++) {
            INNER:
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue OUTER;}}

            int squareVal = 0;
            squareVal = (int) Math.pow(i, 2);
            if (squareVal < 999) {
                System.out.println(i + " " + squareVal);} }}}
