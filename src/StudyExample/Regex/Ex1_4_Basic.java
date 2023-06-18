package StudyExample.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_4_Basic {
    public static void main(String[] args) {
        String s1 ="Alexandr Petrov +79263548675 neo@yandex.ru Julia Filippova +96352584678 juloij@mail.ru Maria Krasnova " +
                "+74596251542 nurjjkhskd@gmail.com";

        Pattern pattern1 = Pattern.compile("\\+\\d{11}");//номер тлф
        Matcher matcher1 = pattern1.matcher(s1);

        while (matcher1.find())
        {System.out.println("Position " + matcher1.start() + matcher1.group());}

        Pattern pattern2 = Pattern.compile("\\w+@\\w+\\.(ru|com)");//почта
        Matcher matcher2 = pattern2.matcher(s1);

        while (matcher2.find())
        {System.out.println("Position " + matcher2.start() + matcher2.group());}
}}
