package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodMapToInt {
    public static void main(String[] args) {
//возвращает инт стрим, стрим который содержит инты

        StudentCollect st1 = new StudentCollect("petya", "Vasin", 4, 26);
        StudentCollect st2 = new StudentCollect("Kostya", "Urov", 2, 19);
        StudentCollect st3 = new StudentCollect("kolya", "Durov", 1, 17);
        StudentCollect st4 = new StudentCollect("Misha", "Lonin", 4, 28);
        StudentCollect st5 = new StudentCollect("masha", "Lonin", 1, 20);
        StudentCollect st6 = new StudentCollect("Lina", "Fedurova", 2, 22);

        List<StudentCollect> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

        List <Integer> courses = list.stream().mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);
        /*
        List <Integer> courses = list.stream().mapToInt(el -> el.getCourse()).collect(Collectors.toList());
        Хоть мэп ту инт возвращает поток курсов, компилятор ругается, почему
        потому что когда мы ходим значение из стрима записать в интеджер, мы должны использовать метод boxed ()
        то есть конвертируем инт в интеджер, курсы это инт!

        есть аналогичный метод MapToDouble

         */


        int sum= list.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum); //возвращает сумму всех курсов

        double age= list.stream().mapToInt(el -> el.getCourse())
                .average() // average возвращает Optional, поэтому не можем присвоить его значение переменной, а должны
                // использовать метод get
                .getAsDouble();
        System.out.println(age); //возвращает сумму всех курсов

        int min= list.stream().mapToInt(el -> el.getCourse()).min().getAsInt();// optional
        System.out.println(min); //возвращает минимальный курс


        int max= list.stream().mapToInt(el -> el.getAge()).min().getAsInt();// optional
        System.out.println(min); //возвращает максимальный возраст

        }

    }


