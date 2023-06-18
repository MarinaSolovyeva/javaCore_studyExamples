package StudyExample.JavaTime.DateTimeFormatter;
//находится в пакете java.time.format

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.*;

public class Basic {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022,03,03);
        LocalTime lt2 = LocalTime.of(12,03,03);
        LocalDateTime ldt2 = LocalDateTime.of(2022,03,03, 12,03,03);

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ldt2.format(d1)); //2022-03-03

        DateTimeFormatter d2 = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(ldt2.format(d2));//20220303

        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(ldt2.format(d3)); // форматирую свой объект с помощь. нужного мне формата 12:03:03

        DateTimeFormatter d4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt2.format(d4));//2022-03-03T12:03:03

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld1); //2022-03-03

        //а эти  два выражения одинаковые
        System.out.println(ld1.format(shortFormatter)); //03.03.2022
        System.out.println(shortFormatter.format(ld1)); //03.03.2022


        //____________________________ofPattern
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm");
        System.out.println(ldt2); //2022-03-03T12:03:03
        System.out.println(ldt2.format(f)); //03 марта 2022, 12:03

        //с помощью метода parse создается объект типа String
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");//2022-03-03T12:03:03

        LocalDate date1 = LocalDate.parse("01 02 2015", f1);
        System.out.println(date1); //2015-01-02

        LocalDate date2 = LocalDate.parse("2015-01-20");
        System.out.println(date2); //2015-01-20



    }
}
