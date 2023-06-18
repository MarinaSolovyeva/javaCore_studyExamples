package StudyExample.Array.Methods;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {
        int array1 [] = {1, 9, 3, -8, 0, 5, 4, 1};

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i]+" ");// на выходе сортирует значения по возрастанию

        //binarySearch (array,value) - поиск опр value в опр array.
        // корректно работает только в уже отсортированном массиве. выдает индекс на котором находится наш элемент

        int index1 = Arrays.binarySearch(array1, 5);// если указывать здесь несуществующее в массиве значение,
        // то компилятор выдаст нам потенциальное расположение значения
        System.out.println(index1);

    }
}
