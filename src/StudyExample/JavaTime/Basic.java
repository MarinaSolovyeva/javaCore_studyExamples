package StudyExample.JavaTime;
import java.time.*;
public class Basic {
    //у всех классов есть метод now
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        LocalDate ld1 = LocalDate.of(2022,6,25);
        LocalDate ld2 = LocalDate.of(2022, Month.AUGUST,25);
        System.out.println(ld1);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(15,41);
        LocalTime lt2 = LocalTime.of(15,41,05);
        LocalTime lt3 = LocalTime.of(15,41,00,052);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);

        LocalDateTime ldt1 = LocalDateTime.of (2022, 8,25,15,51);
        LocalDateTime ldt2 = LocalDateTime.of (2022, Month.AUGUST,25,15,51);
        System.out.println(ldt1);
        System.out.println(ldt2);

        LocalDateTime ldt3 = LocalDateTime.of (ld1, lt1);
        System.out.println(ldt3);

        //_________________________________________________________________________
        //                                      MethodsLocalDate

        //plusDays ()
        LocalDate ld3 = LocalDate.of(2022,1,01);
        ld3 = ld3.plusDays(5);
        System.out.println(ld3); // 06.01.2022

        //minusDays ()
        LocalDate ld4 = LocalDate.of(2022,1,31);
        ld4 = ld4.minusDays(1);
        System.out.println(ld4); // 30.01.

        //plusWeeks ()
        LocalDate ld5 = LocalDate.of(2022,1,01);
        ld5 = ld5.plusWeeks(1);
        System.out.println(ld5); // 2022-01-08

        //minusWeeks ()
        LocalDate ld6 = LocalDate.of(2022,1,31);
        ld6 = ld6.minusWeeks(1);
        System.out.println(ld6); // 2022-01-24

        //plusMonths ()
        LocalDate ld7 = LocalDate.of(2022,1,01);
        ld7 = ld7.plusMonths(1);
        System.out.println(ld7); // 2022-02-01

        //minusMonths ()
        LocalDate ld8 = LocalDate.of(2022,1,31);
        ld8 = ld8.minusMonths(1);
        System.out.println(ld8); // 2021-12-31

        //plusYears ()
        LocalDate ld9 = LocalDate.of(2022,1,01);
        ld9 = ld9.plusYears(1);
        System.out.println(ld9); // 2023-01-01

        //minusYears ()
        LocalDate ld10 = LocalDate.of(2022,1,31);
        ld10 = ld10.minusYears(1);
        System.out.println(ld10); // 2021-01-31

        LocalDate ld11 = LocalDate.of(2022,1,01);
        LocalDate ld12 = LocalDate.of(2022,2,01);

        System.out.println(ld11.isAfter(ld12));
        System.out.println(ld11.isBefore(ld12));

        //_________________________________________________________________________
        //                                      MethodsLocalTime

        //plusHours ()
        LocalTime lt4 = LocalTime.of(12,00,00,00);
        lt4 = lt4.plusHours(1);
        System.out.println(lt4); //13:00

        //minusHours ()
        LocalTime lt5 = LocalTime.of(12,00,00,00);
        lt5 = lt5.minusHours(1);
        System.out.println(lt5); //11:00

        //plusMinutes ()
        LocalTime lt6 = LocalTime.of(12,00,00,00);
        lt6 = lt6.plusMinutes(1);
        System.out.println(lt6); //12:01

        //minusMinutes ()
        LocalTime lt7 = LocalTime.of(12,00,00,00);
        lt7 = lt7.minusMinutes(1);
        System.out.println(lt7); //11:59

        //plusSeconds ()
        LocalTime lt8 = LocalTime.of(12,00,00,00);
        lt8 = lt8.plusSeconds(1);
        System.out.println(lt8); //12:00:01

        //minusSeconds()
        LocalTime lt9 = LocalTime.of(12,00,00,00);
        lt9 = lt9.minusSeconds(1);
        System.out.println(lt9); //11:59:59

        //plusNanos ()
        LocalTime lt10 = LocalTime.of(12,00,00,00);
        lt10 = lt10.plusNanos(1);
        System.out.println(lt10); //12:00:00.000000001

        //minusNanos ()
        LocalTime lt11 = LocalTime.of(12,00,00,00);
        lt11 = lt11.minusNanos(1);
        System.out.println(lt11); //11:59:59.999999999

        LocalTime lt12 = LocalTime.of(12,00,00,00);
        LocalTime lt13 = LocalTime.of(13,00,00,00);
        System.out.println(lt12.isAfter(lt13));
        System.out.println(lt12.isBefore(lt13));


        //localDateTime содержит методы классов LocalDate и LocalTime




    }
}
