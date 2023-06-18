package StudyExample.Array.Methods;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int array1 [] = {1, 9, 3, -8, 0, 5, 4, 1};

        //method sort - сортирует массив
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i]+" ");

        System.out.println (" ");

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i]+" ");// на выходе сортирует значения по возрастанию

    }
}
