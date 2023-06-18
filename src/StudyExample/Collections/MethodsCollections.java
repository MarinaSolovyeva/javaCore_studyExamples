package StudyExample.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsCollections {

    public static void main(String[] args) {
        ArrayList <Integer> arrList = new ArrayList<>();
        arrList.add(-3);
        arrList.add(8);
        arrList.add(5);
        arrList.add(-24);
        arrList.add(-56);
        arrList.add(0);
        arrList.add(12);
        Collections.sort(arrList);
        int index1 = Collections.binarySearch(arrList, 5); //4. если искать число которого нет,
        // выведется минусовое значение
        System.out.println(index1);

        Collections.reverse(arrList); // переворачивает
        System.out.println(arrList);

        Collections.shuffle(arrList); //смешивает элементы
        System.out.println(arrList);
    }
}
