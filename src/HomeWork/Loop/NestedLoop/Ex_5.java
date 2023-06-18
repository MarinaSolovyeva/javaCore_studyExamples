package HomeWork.Loop.NestedLoop;

public class Ex_5 {
    /*Напишите класс, который находит натуральное число от 1 до 100 с максимальной суммой делителей. */

    public static void main(String[] args) {
        int maxSum = 0;
        int value = 0;

        for (int i = 1; i < 100; i++) {
            int sum = 0;
            for (int j = 1; j < 100; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (sum > maxSum) {
                        maxSum = sum;
                        value = i; } } } }
        System.out.println("\nУ числа " + value + " максимальная сумма делителей " + maxSum); }}
