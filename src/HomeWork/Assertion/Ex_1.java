package HomeWork.Assertion;

import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {
        System.out.println("Введите число");
        int size = 6;

        assert (size < 5) : ("Неверное число " + size);

        System.out.println("Вы ввели число " + size);
    }

}
