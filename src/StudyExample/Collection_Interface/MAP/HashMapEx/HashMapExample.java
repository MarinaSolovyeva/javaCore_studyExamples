package StudyExample.Collection_Interface.MAP.HashMapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); //ключ будет интереджер, валью будет стрин
        // с помощью метода Put можем добавлять элементы в map
        map1.put(1000, "Marina Solovyeva");
        map1.put(3568, "Denis Savateev");
        map1.put(2586, "Anna Sidorova");
        map1.put(1258, "Nikolay Petrov");
        map1.put(1258, "Maria Filippova");
        System.out.println(map1);
        map1.putIfAbsent(1258, "Anna Petrova"); //добавь если такого еще нет

        /* Если написать элемент с таким же ключом - старый удалится, новый добавится
        Но если написать putIfAbsent - тогда элемент не заменится */

        System.out.println(map1);

        //get _________________выводим значение по ключу. если такого ключа нет - выведетеся налл
        System.out.println(map1.get(1000));

        //REMOVE _________________удаляем по ключу
        map1.remove(2586);
        System.out.println(map1);

        //containsKey containsValue_________________boolean
        System.out.println(map1.containsKey(1258)); //выводит тру если в хэшмэпе содержится искомое значение, по ключу
        System.out.println(map1.containsValue("Marina Solovyeva")); //выводит тру если в хэшмэпе
        // содержится искомое значение, по значению

        // KEYSET  _________________ множество всех ключей которыми мы польуемся, которые есть в нашем хэшмэпе
        System.out.println(map1.keySet()); //[3568, 1000, 1258]

        // VALUES ___________множество значений из хэшмэпа
        System.out.println(map1.values()); // [Denis Savateev, Marina Solovyeva, Maria Filippova]
    }
}
