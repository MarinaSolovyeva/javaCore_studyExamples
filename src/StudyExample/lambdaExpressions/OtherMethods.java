package StudyExample.lambdaExpressions;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class OtherMethods {
    public static void main(String[] args) {


        //метод ForEach , принимает в параметрах consumera

        List<String> list = List.of("One", "Two", "Three");
/*
        for (String s : list)
        {System.out.println(s);}
        вместо этого кода , могу написать так */

        list.forEach(s -> System.out.println(s));


        //метод RemoveIf
        ArrayList <Integer>al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);

        al.removeIf(element -> element%3 == 0); //удаляет элементы кратные 3
        System.out.println(al);

        //sort

        ArrayList <Integer>al2 = new ArrayList<>();
        al2.add(1);
        al2.add(3);
        al2.add(6);
        al2.add(4);
        al2.add(2);
        al2.add(5);
        al2.add(7);

        System.out.println(al2);
        al2.sort((x,y)->x.compareTo(y));
        System.out.println(al2);
        //если хочу отсортировать в обратном порядке : al2.sort((x,y)-> -x.compareTo(y));,
        // то есть добавляю минус
    }
}
