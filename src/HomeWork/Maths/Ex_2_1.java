package HomeWork.Maths;

public class Ex_2_1 {

    /*
Напишите класс, который генерирует и выводит на экран 2 случайных
целых числа из диапазона «однозначные» (включая и положительные,
и отрицательные).
После этого в отдельной строке класс должен вывести наибольшее из
этих двух чисел - с соответствующим текстовым сообщением.
     */

    public static void main(String[] args) {
    int randomNum1 = -9 + (int)(Math.random() * ((9 - -9) + 1));
    int randomNum2 = -9 + (int)(Math.random() * ((9 - -9) + 1));


        System.out.println(randomNum1 + "," + randomNum2);

        System.out.println(randomNum1 > randomNum2 ? randomNum1 : randomNum2 + " большее число");
    }
}
