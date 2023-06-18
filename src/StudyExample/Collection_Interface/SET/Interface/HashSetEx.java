package StudyExample.Collection_Interface.SET.Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args){
    Set<String> set = new HashSet<>();
    set.add ("Marina");//когда вызываем метод add, он вызывает метод put у hashset
    set.add ("Denis");//когда вызываем метод add, он вызывает метод put у hashset
    set.add ("Igor");//когда вызываем метод add, он вызывает метод put у hashset
        System.out.println(set);
        System.out.println(""); //[Igor, Denis, Marina]
        for (String s:set) {System.out.print(s + " ");} //Igor Denis Marina
//методы принадлежат интерфейсу сет, значит распр на все классы
        System.out.println(set.size()); //3

        System.out.println(set.isEmpty()); // пустой ли

        System.out.println(set.contains("Misha")); // false

        System.out.println(set.contains("Misha")); // false
}
}