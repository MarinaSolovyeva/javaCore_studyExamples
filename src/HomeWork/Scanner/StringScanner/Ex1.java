package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex1 {
    //класс принимает с клавиатуры 2 строковых значений - имя и фамилию,на выходе должно выводиться на экран
    //Вас зовут а рядом через пробел - имя и фамиллию

    public static void main(String[] args) {
        System.out.println("Введите ваше имя и вашу фамилию");
        String nameSurname = new Scanner(System.in).nextLine();
        System.out.println("Вас зовут " + nameSurname);
    }
}
