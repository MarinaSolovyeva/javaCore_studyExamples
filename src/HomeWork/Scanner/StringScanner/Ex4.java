package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex4 {
    /* Напишите класс, который принимает с клавиатуры фамилию, имя и отчество, а затем выводит на экран инициалы  */
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите фамилию , имя и отчество");
        String name, surname, patronymic;
        surname = in.next();
        name = in.next();
        patronymic = in.next();
        char сName = name.charAt(0);
        char сPatronymic = patronymic.charAt(0);
        System.out.println(surname + " " + сName + ". "+ сPatronymic + ".");
    }
}
