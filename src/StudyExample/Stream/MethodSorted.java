package StudyExample.Stream;

import java.util.Arrays;

public class MethodSorted {
    public static void main(String[] args) {
        int [] array = {9,5,8,21,1,5,12,15,7,33};
        array = Arrays.stream (array).sorted().toArray();
        System.out.println(Arrays.toString(array)); //[1, 2, 5, 5, 8, 9, 15]

        /*
        если применять сортет на наш класс, то нужно писать компаратор
        list =list.stream().sorted((x,y)-> x.getName().compareTo(y.getName())).collect(Collectors.toList());
         */

    }
}
