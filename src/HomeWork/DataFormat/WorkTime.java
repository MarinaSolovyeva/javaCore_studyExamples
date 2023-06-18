package HomeWork.DataFormat;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class WorkTime {

    static DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    static DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");
    static Period p = Period.ofDays(1);
    static Duration d = Duration.ofHours(8);

    static void smena(LocalDateTime nachalo, LocalDateTime konec, Period p1, Duration d1){
        LocalDateTime date = nachalo;
        while (date.isBefore(konec)) {
            System.out.print("Работаем с :" + date.format(dt1));
            date = date.plus (p);
            System.out.println(" До :"+(date.plus(d1)).format(dt1));
            System.out.print("Отдыхаем с :"+date.format(dt2));
            date = date.plus (d);
            System.out.println(" До :"+(date.plus(p1)).format(dt2));
    }}

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2022, 1, 10, 10, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 2, 01, 18, 30);

        smena(ldt1,ldt2,p,d);




    }
}
