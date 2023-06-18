package HomeWork.Loop.NestedLoop;

public class Ex_2 {
    /*
    Напишите класс, который будет выводить на экран делители каждого
числа от 1 до 75.
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 75; i++) {
            System.out.println("\nДелители числа " + i);
            for (int j = 1; j <= 75; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
