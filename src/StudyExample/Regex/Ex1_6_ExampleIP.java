package StudyExample.Regex;

import java.util.regex.Pattern;

public class Ex1_6_ExampleIP {

    void checkIP (String IP) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d) (\\.)) {3} "+
                "(25[0-5]|2[0-4]\\d | [01]?\\d?\\d)";

        /*(25[0-5]     |    2[0-4]\d                                |   [01]?\d?\d)    (\.)           {3}- повтори это все 3 раза
       250-255       20-24 и люб цифра, то есть 200-249                      0-199      точка
        */

        System.out.println(IP + " is ok? " + Pattern.matches(regex, IP));
    }
    public static void main(String[] args) {
        // IP корректно, если состоит из 4 чисел и каждое в интервалах 0-255.0-255.0-255.0-255

        String IP1 = "255.38.192.99" ;
        String IP2 = "182.262.91.05" ;

        Ex1_6_ExampleIP regex = new Ex1_6_ExampleIP();
        regex.checkIP(IP1);
        regex.checkIP(IP2);


    }
}
