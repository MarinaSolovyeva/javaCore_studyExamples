package StudyExample.Regex;

public class Ex1_7_ReplaceAll {
    public static void main(String[] args) {
        String s1 = "Привет, мой     друг!     Как идет изучение    Java? ";
        s1 = s1.replaceAll(" {2,}", " "); //меняем два и более пробелов на 1
        System.out.println(s1);
    }
}
