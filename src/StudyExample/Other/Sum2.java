package StudyExample.Other;

import java.beans.Transient;
import java.lang.annotation.Inherited;
import java.util.Scanner;
/*Задано четырёхзначное число. Если сумма первых двух его цифр равна сумме третьей и четвёртой цифры,
вывести на экран true, в противном случае false. С соответствующим поясняющим текстом.
Например, 3526. Если 3+5 равно 2+6, то должно быть выведено true.
Ограничение и одновременно подсказка. Нельзя использовать оператор if.
Решить задачу необходимо, используя только данные логического типа.*/

public class Sum2 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите четырехзначное число ");

        int i = new Scanner(System.in).nextInt();

        int i4 = i / 1 % 10;
        int i3 = i / 10 % 10;
        int i2 = i /100 % 10;
        int i1= i / 1000 % 10;

        boolean result = (i4+i3) > (i2 +i1);


        System.out.println(result);




    }
}
