package StudyExample.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_3_Basic {
    public static void main(String[] args) {
        String s1 = "OPABCDNJFABC5DHBC";
        Pattern pattern1 = Pattern.compile("ABC.");// . - любой символ
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position " + matcher.start()+ " " + matcher.group());
        }
        System.out.println("______________________");

        String s2 = "OP4NJFABC5DH1";
        Pattern pattern2 = Pattern.compile("\\d");// любая цифра. //D - любая нецифра
        Matcher matcher2 = pattern2.matcher(s2);
        while (matcher2.find()) {
            System.out.println("Position " + matcher2.start()+ " " + matcher2.group());
        }
        System.out.println("______________________");


    }
}
