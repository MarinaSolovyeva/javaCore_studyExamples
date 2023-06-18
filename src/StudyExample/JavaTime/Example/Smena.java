package StudyExample.JavaTime.Example;
import java.time.*;

public class Smena {
    static void smenaDejurnogo (LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore((konec))) {

            System.out.println("Nastupila data "+data+ " . Pora menyat dejurnogo");
            data = data.plus (p);

        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2023, Month.MAY, 31);
        Period p = Period.ofMonths(1); //можно менять на кол-во дней, недель и тд
        smenaDejurnogo(nachalo, konec, p);

        // класс Period имеет конструктров access modifier private. методы of возвращают объект типа Period

        //class Duration
        //ofDays, ofHours, ofMinutes, ofSeconds, ofMillis, of Nanos


        LocalDateTime ldt = LocalDateTime.of(2022, 9, 30, 1, 16, 40);
        Period p1 = Period.ofMonths(3);
        Duration d1 = Duration.ofHours(3);
        System.out.println(ldt.plus(p1).plus(d1)); //2022-12-30  T  04:16:40

    }
}
