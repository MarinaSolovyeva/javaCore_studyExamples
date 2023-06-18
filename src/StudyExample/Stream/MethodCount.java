package StudyExample.Stream;

import java.util.stream.Stream;

public class MethodCount {
    //считает кол-во элементов в стриме, возвращает лонг
    public static void main(String[] args) {
        Stream<Integer> myStream1 = Stream.of(1,5,2,8,0,1,7,4,8,2);
        System.out.println(myStream1.count());
        System.out.println(myStream1.distinct().count());//кол-во уникальных элементов
        //стрим после обработки нельзя переиспользовать. если я оставлю код так и вызову строку 10 - будет exception
        // но если закомментировать 9 строку. то все будет ок
    }
}
