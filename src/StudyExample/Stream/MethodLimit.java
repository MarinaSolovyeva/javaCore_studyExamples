package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;

public class MethodLimit {
    public static void main(String[] args) {
//возвращает стрим. ограничивает кол-во элементов в нашем стриме

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

        list.stream().filter(x ->x.getAge()>=17).limit(2).forEach(x -> System.out.println(x + " "));

        }
    }


