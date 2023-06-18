package StudyExample.ConditionalOperator;

import java.util.Scanner;

public class IF_Month {
    /*Необходимо задать номер месяца.
    Программа должна выдавать на выходе время года, к которому относится данный месяц */

    public static void main(String[] args) {


        System.out.println("Пожалуйста,введите номер месяца");
        double month = new Scanner(System.in).nextDouble();

        String season = "";

        if (month <= 2 || month == 12 ) season = "Зима";
        else if (month <= 5) season = "Весна";
        else if (month <=8 ) season = "Лето";
        else if (month <= 11 ) season = "Осень";

        System.out.println("Время года "+ season);
    }
}
