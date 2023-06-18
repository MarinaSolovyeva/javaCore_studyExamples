package StudyExample.Stream;

import java.util.Arrays;

public class MethodFindFirst {

    // возвращает первый элемент стрима

    public static void main(String[] args) {
        int [] array = {5,8,5,16,5};
        int first = Arrays.stream(array).findFirst().getAsInt();
        System.out.println(first);

    }
}
