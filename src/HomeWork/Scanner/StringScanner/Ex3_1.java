package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex3_1 {
    /*
    Напишите класс, который принимает с клавиатуры имя и фамилию ученика. Класс должен в одной строке вывести сначала
    Фамилию, а после нее Имя, а во второй строке сначала Имя,а потом фамилию
     */

    public static void main(String[] args) {
        System.out.println("Введите ваше имя и фамилию");
        String nameSurname = new Scanner(System.in).nextLine();
        String [] words = nameSurname.split(" ");
        String name = words[0];
        String surname = words[1];
        System.out.println(surname + " " +name);
        System.out.println(name + " " + surname);


    }
}
