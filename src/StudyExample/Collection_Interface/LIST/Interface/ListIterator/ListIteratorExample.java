package StudyExample.Collection_Interface.LIST.Interface.ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray() //  с помощью этого метода получаем массив символос
        ) {
            list.add(ch);
        }
        // System.out.println(list); - [m, a, d, a, m]
        ListIterator<Character> iterator = list.listIterator();//начинает работу с нулевой позиции
        ListIterator<Character> reverseIterator = list.listIterator(list.size());//начинает работу последней позиции

        boolean isPalendrom = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) { //пока следующий э
            if (iterator.next() != reverseIterator.previous()) {
                isPalendrom = false;
                break;
            }
        }
        if (isPalendrom) {
            System.out.println("Palendrom");
        } else {
            System.out.println("Not palendrom");
        }
    }
}
