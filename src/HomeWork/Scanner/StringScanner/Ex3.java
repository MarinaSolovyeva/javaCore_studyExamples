package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex3 {
    /*
    Напишите класс, который принимает с клавиатуры имя и фамилию ученика. Класс должен в одной строке вывести сначала
    Фамилию, а после нее Имя, а во второй строке сначала Имя,а потом фамилию
     */

    public static void main(String[] args) {
        System.out.println("Введите ваше имя и фамилию");
        String name = new Scanner(System.in).nextLine();
        String surname = new Scanner(System.in).nextLine();
        System.out.println(surname + " " + name);
        System.out.println(name + " " + surname);
    }
}
