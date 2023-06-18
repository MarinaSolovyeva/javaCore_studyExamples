package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex5 {
    /* Напишите класс, который принимает с клавиатуры два строковых значения, каждое из которых содержит имя человека,
    и проверяет, являются ли эти люди тезками. По результатам проверки следует вывести на экран соответствующее сообщение. */

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String name1 = sc.next();
        String name2 = sc.next();

        if (name1.equals(name2)) {
            System.out.println("Тезки");
        } else {
            System.out.println("Имена разные");
        }
    }
}