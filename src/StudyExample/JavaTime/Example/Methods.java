package StudyExample.JavaTime.Example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Methods {
    public static void main(String[] args) {


    LocalDate ld1 = LocalDate.of(2022,03,03);
    LocalDateTime ldt1 = LocalDateTime.of(2022,03,03, 12,00);
        System.out.println(ld1.getDayOfWeek()); //THURSDAY
        System.out.println(ld1.getDayOfMonth()); //3
        System.out.println(ld1.getDayOfYear()); //62
        System.out.println(ld1.getMonth()); //MARCH
        System.out.println(ld1.getMonthValue()); //3
        System.out.println(ld1.getYear()); //2022


        LocalTime lt1 = LocalTime.of(12,03,03);
        LocalDateTime ldt2 = LocalDateTime.of(2022,03,03, 12,03,03);
        System.out.println(lt1.getHour());//12
        System.out.println(lt1.getMinute()); //3
        System.out.println(lt1.getSecond()); //3
        System.out.println(lt1.getNano());

}}