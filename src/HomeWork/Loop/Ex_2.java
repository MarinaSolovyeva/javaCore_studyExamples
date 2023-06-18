package HomeWork.Loop;

public class Ex_2 {
    /*
    Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел
    из диапазона -20".+35. После каждого отрицательного числа
    следует вывести (вплотную к числу) символ«?» (знак вопроса).
     */

    public static void main(String[] args) {

        int min = - 20;
        int max = 35;

        for (int i =0; i < 15; i ++) {
            int random = min + (int) (Math.random() * (max - min + 1));
            System.out.print(random < 0 ? random + "? " : random + " ");
        }
    }
}
