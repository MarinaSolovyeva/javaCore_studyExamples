package HomeWork.Loop.NestedLoop;

public class Ex_7 {
/* Напишите класс, который выводит на экран все простые двузначные
числа. Класс также должен определить количество и сумму этих чисел. */

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        OUTER: for (int i = 10; i < 100; i++) {

            INNER: for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue OUTER;}
                }
            count++;
            sum += i;
            System.out.print(i + " ");
            }
        System.out.println("\n Сумма чисел " + sum + " , их количество " + count);
    }
}
