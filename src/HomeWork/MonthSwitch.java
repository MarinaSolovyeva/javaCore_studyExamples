package HomeWork;

import java.time.Month;

public class MonthSwitch
/*
В классе Month создайте метод, у которого 1 параметр типа данных int,
он будет указывать на порядковый номер месяца.
Используя switch, выведите на экран количество дней для этого месяца

 */ {
    public static void dayQuantity(int n) {
        switch (n) {
            case 2:
                System.out.println("В месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            default:
                System.out.println("Значение задано неверно");
        }
    }


    public static void main(String[] args) {
        MonthSwitch.dayQuantity(0);
        dayQuantity(1);
        MonthSwitch.dayQuantity(2);
        dayQuantity(-5); // можно писать и так и так
    }
}

















   /* int month;

    void accountDays(int month) {
        this.month = month;
    }


    public static void main(String[] args) {


        MonthSwitch m = new MonthSwitch();
        m.accountDays(4);
        switch (m.month) {
            case 1:
                System.out.println("В январе 31 день");
                break;
            case 2:
                System.out.println("В феврале 28 деней");
                break;
            case 3:
                System.out.println("В марте 31 день");
                break;
            case 4:
                System.out.println("В апреле 30 дней");
                break;
            case 5:
                System.out.println("В мае 31 день");
                break;
            case 6:
                System.out.println("В июне 30 дней");
                break;
            case 7:
                System.out.println("В июле 31 день");
                break;
            case 8:
                System.out.println("В августе 31 день");
                break;
            case 9:
                System.out.println("В сентябре 30 дней");
                break;
            case 10:
                System.out.println("В октябре 31 день");
            case 11:
                System.out.println("В ноябре 30 дней");
                break;
            case 12:
                System.out.println("В декабре 31 день");
            default:
                System.out.println("Значение задано неверно");

        */
