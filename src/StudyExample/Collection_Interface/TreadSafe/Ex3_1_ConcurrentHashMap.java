package StudyExample.Collection_Interface.TreadSafe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
public class Ex3_1_ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap <Integer, String> map = new ConcurrentHashMap<>();
        /*
        Если написать просто HashMap -в какой то момент выбросится concurrent modification Exception: первый поток еще что то
        выводил на экран, второй решил уже что-то добавить- Iterator такие вещи не прощает
         */
        map.put(1,"Marina");
        map.put(2,"Denis");
        map.put(3,"Julya");
        map.put(4,"Richard");
        map.put(5,"Igor");
        System.out.println(map);

        Runnable runnable1 = () ->{
                Iterator <Integer> iterator = map.keySet().iterator();//у map нет метода iterator, поэтому мы
            //сначала выдергиваем ключи, а потом используем метод тератор
            while(iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
             Integer i = iterator.next();
            System.out.println(i+ ":" +map.get(i));}
            /* С помощь. итератора котор создали на множестве ключей, сначала спим, ключ элемента передеаем в интеджер и
            * и потом выводим ключ и значение к нему */
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Elena");
        };

        Thread thread1 = new Thread (runnable1);
        Thread thread2 = new Thread (runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
