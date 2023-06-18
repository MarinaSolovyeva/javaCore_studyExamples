package StudyExample.Array.Methods;

import java.util.Arrays;

public class CompareArrays {
    //compare -
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};

        char [] array3 = {'p', 'r', 'i', 'v','e', 't'};
        char [] array4 = {'p', 'r', 'i', 'v','i', 'v','k', 'a'};

        System.out.println(Arrays.compare(array1, array2)); // -1 - возвращает значение меньше нуля
        // когда первый массив меньше второго. если переставить значения наоборот, будет 1,
        // то есть знач больше нуля . если знач одинаковые - 0
        System.out.println(Arrays.compare(array3, array4)); // -4
    }
}
