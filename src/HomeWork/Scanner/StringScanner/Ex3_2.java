package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex3_2 {
    /*
    Напишите класс, который принимает с клавиатуры имя и фамилию ученика. Класс должен в одной строке вывести сначала
    Фамилию, а после нее Имя, а во второй строке сначала Имя,а потом фамилию
     */
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String name, surname, patronymic;

        name = in.next();
        surname = in.next();
        patronymic = in.next();

        System.out.println(name + " " + surname + " " + patronymic);
        System.out.println(surname + " " + name + " " + patronymic);



    }
}
