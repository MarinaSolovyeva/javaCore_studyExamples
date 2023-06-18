package HomeWork.Tests;

public class Test1 {
    /*
    Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
     */

    public static void main(String[] args) {
        OUTER: for (int i = 2; i < 101; i++) {
            INNER: for (int j = 2; j < i; j++) {
                if ((i & j) == 0) continue OUTER;
                }

            System.out.println(i + " ");
    }
}}
