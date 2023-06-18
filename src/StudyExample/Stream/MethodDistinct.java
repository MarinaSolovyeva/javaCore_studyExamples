package StudyExample.Stream;

import java.util.stream.Stream;

public class MethodDistinct {
    //возвращает стрим уникальных элементов

    public static void main(String[] args) {
        Stream<Integer> myStream1 = Stream.of(1,5,2,8,0,1,7,4,8,2);
        myStream1.distinct().forEach(System.out::println);
    }
}
