package HomeWork.Loop.NestedLoop;

public class Ex_3 {
    /*
    Целое число называется <<Полноценным», если сумма делителей (включая 1, но,
    не включая само число) числа равна самому числу.
Напишите класс, который выводит на экран все «полноценные» числа
ОТ 1 ДО 100000.
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 100_000; i++) {

            int sum = 0;

            for (int j = 1; j < 100_000; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (i == sum) {
                        System.out.println("Полноценное число " + i + ". Сумма его делителей " + sum);
                    }
                }
            }
        }
    }
}
