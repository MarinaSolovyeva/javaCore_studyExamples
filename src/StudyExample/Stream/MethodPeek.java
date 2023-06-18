package StudyExample.Stream;

import java.util.stream.Stream;

public class MethodPeek {
    //принимает консьюмера , возвращает стрим,является интермидеат метода, как for each, только промежуточный,
    // используется чтобы посмотреть что происходит на разных этапах метода

    public static void main(String[] args) {
        Stream<Integer> myStream1 = Stream.of(1,5,2,8,0,1,7,4,8,2);
        System.out.println(myStream1.distinct().peek(System.out::println).count());
        //оставляем только уник элементы, с помощью пика просматриаю какие остались, и каунт показывает кол-воо


    }
}
