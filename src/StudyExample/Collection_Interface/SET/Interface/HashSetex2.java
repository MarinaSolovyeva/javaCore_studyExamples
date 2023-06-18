package StudyExample.Collection_Interface.SET.Interface;

import java.util.HashSet;

public class HashSetex2 {
    public static void main(String[] args) {
        HashSet <Integer> hashSet1 = new HashSet<>();
        hashSet1.add (2);
        hashSet1.add (3);
        hashSet1.add (5);
        hashSet1.add (1);
        hashSet1.add (8);

        HashSet <Integer> hashSet2 = new HashSet<>();
        hashSet2.add (7);
        hashSet2.add (4);
        hashSet2.add (3);
        hashSet2.add (5);
        hashSet2.add (8);

        /* первая операция - множество.объединяются наши множества.у них общ элементы 3 и 8 5.
         у первого есть элемент 2 и 1, у второго 7 и 4
*/

//        HashSet <Integer> unionHashSet2 = new HashSet<>(hashSet1); //принял в параметрах
//        // первый хэш сэт поэтому юнион такой же как сэт 1
//        unionHashSet2.addAll(hashSet2);
//        System.out.println(unionHashSet2);//содержит все элементы, дубликаты не создаются

//        HashSet <Integer> intersect = new HashSet<>(hashSet1);
//        intersect.retainAll(hashSet2);// оставляет из первого множества только те элементы что есть во втором хэшсэте
//        System.out.println(intersect);
//
        // removeAll  -удали из первого хэшсэта все элементы второго хэшсэта
        HashSet <Integer> subtracked = new HashSet<>(hashSet1);
        subtracked.retainAll(hashSet2);
        System.out.println(subtracked);
    }
}
