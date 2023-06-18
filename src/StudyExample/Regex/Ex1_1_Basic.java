package StudyExample.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1_1_Basic {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCHFGDABCFDKABCH";
        Pattern pattern1 = Pattern.compile("ABC");//чтобы создать шаблон regex используем pattern
        //ищу значения которые подходят под мой шаблон pattern1. его конструктор private, поэтому используем метод compile ,
        //который возвращает объект типа pattern
        Matcher matcher = pattern1.matcher(s1);//находит соответствия, мы наш шаблон сверяем на соответствие с нашим стрингом

        while (matcher.find()) {//возвращает тру если совпадение было найдено
            System.out.println("Position " + matcher.start()+ " " + matcher.group());//выводим с помощью функции груп все совпадения
        }
    }
}
