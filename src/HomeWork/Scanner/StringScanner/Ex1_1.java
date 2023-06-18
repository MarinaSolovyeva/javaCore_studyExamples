package HomeWork.Scanner.StringScanner;

import org.w3c.dom.css.CSSUnknownRule;

import java.util.Scanner;

public class Ex1_1 {
    //класс принимает с клавиатуры 2 строковых значений - имя и фамилию,на выходе должно выводиться на экран
    //Вас зовут а рядом через пробел - имя и фамиллию

    public static void main(String[] args) {
        System.out.println("Введите ваше имя и вашу фамилию");
        String name = new Scanner(System.in).nextLine();
        String surname = new Scanner(System.in).nextLine();
        System.out.println("Вас зовут " + name + " " +surname);
    }
}
