package StudyExample.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MethodChaining {
    public static void main(String[] args) {

        int[] array = {9, 5, 8, 21, 1, 64, 5, 12, 15, 7, 33};
        //поток из массива, отфильтруем массив чтобы остались нечетные числа,
        // поделим на 3 те числа что делятся без остатка на 3 и найдем сумму оставшихся чисел

        int result = Arrays.stream(array).filter(e ->
                e % 2 != 0).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt(); // у Array нет метода get, только GetAsInt
        System.out.println(result);
    }
}
