package HomeWork.Scanner.StringScanner;

import java.util.Scanner;

public class Ex2 {
    /*
    Напишите класс, который принимает с клавиатуры фамилию пассажира и город прилета. Класс должен
    построить строковую переменную, которая будет содержать сообщение Пассажир..вылетает в ..
     */
    public static void main(String[] args) {
        System.out.println("Введите вашу Фамилию и город прилета");
        String surname = new Scanner(System.in).nextLine();
        String city = new Scanner(System.in).nextLine();
        System.out.println("Пассажир "+ surname +" вылетает в " + city);

    }
}
