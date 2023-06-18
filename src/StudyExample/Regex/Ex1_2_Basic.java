package StudyExample.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_2_Basic {
    public static void main(String[] args) {
        String s1 = "OPANJFDHBC";
        Pattern pattern1 = Pattern.compile("[ABC]");// или
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position " + matcher.start()+ " " + matcher.group());
        }


        System.out.println("______________________");


        String s2 = "ABDOP";
        Pattern pattern2 = Pattern.compile("AB[C-E]OP");// или
        Matcher matcher2 = pattern2.matcher(s2);

        while (matcher2.find()) {
            System.out.println("Position " + matcher2.start()+ " " + matcher2.group());
        }

        System.out.println("______________________");


        String s3 = "ABCD ABCE ABC5ABCG6ABCH";
        Pattern pattern3 = Pattern.compile("ABC[^E-G4-7]");// ABC обязательно,а дальеш исключая интервалы: либо e-g либо 4-7
        Matcher matcher3 = pattern3.matcher(s3);

        while (matcher3.find()) {
            System.out.println("Position " + matcher3.start()+ " " + matcher3.group());//Position 0 ABCD
            //Position 19 ABCH
        }

        System.out.println("______________________");
    }
}
