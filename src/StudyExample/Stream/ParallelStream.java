package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    /* 1,2,3,4....100000 , необходимо посчитать перемножение
    При последовательном стриме мы бы 1 умножали на 2, потом на 3..

    При параллельном , если компьютер многоядерный, мы говорим
    пусть 1 ядро перемножит от 1 до 25 000, 2 процессор от 25 001 до 50 000
    ..
    а потом уже эти результаты объединяются в итоговое значение
    не нужно использовать многопоточность, достаточно написать java одну команду
    */

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5.16);
        list.add(3.0);
        list.add(2.56);
        list.add(8.34);
        list.add(19.84);

        double sumresult = list.parallelStream().reduce((a,e) ->
                a+e).get();
        System.out.println("sumresult " + sumresult);

        double divisionresult = list.parallelStream().reduce((a,e) ->
                a/e).get();
        System.out.println("sumresult " + sumresult);
    }

}
