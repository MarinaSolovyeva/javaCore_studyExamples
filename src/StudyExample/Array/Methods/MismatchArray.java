package StudyExample.Array.Methods;

import java.util.Arrays;

public class MismatchArray {
    //mismatch- находит индекс первого расхождения массивов или минус 1,если они одинаковые
    public static void main(String[] args) {
        int [] array1 = {1,2,3,5};
        int [] array2 = {1,2,3,5};

        char [] array3 = {'p', 'r', 'i', 'v','e', 't'};
        char [] array4 = {'p', 'r', 'i', 'v','i', 'v','k', 'a'};

        System.out.println(Arrays.mismatch(array1, array2)); // -1
        System.out.println(Arrays.mismatch(array3, array4)); // 4
    }
}
