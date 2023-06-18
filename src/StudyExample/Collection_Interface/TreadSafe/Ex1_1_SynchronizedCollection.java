package StudyExample.Collection_Interface.TreadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_1_SynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList <Integer> sourse = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sourse.add(i);
        }
//        ArrayList <Integer> target = new ArrayList<>();
        List<Integer> synchList =
                Collections.synchronizedList(new ArrayList<>());
        //будем синхронизировать новосозданный аррэйлист, можем использовать уже созданный. создаем аррэй лист ,
        // синхронизируем его ,и synchlist уже будет ссылаться на него
        Runnable runnable = () -> {synchList.addAll(sourse);};
        /*
        Будем в лист таргет добавлять все элементы листа сорс
        и мы хотим двумя разными потоками выполнять это действие
        наш раннэбл будет добавлять элементы из аррэй листа сорт в синхр лист синх лист. синх лист -
        синхронизированная обертка для новосозданного аррэй листа. или говорят синхронайзд вью для новосозданного
        аррэй листа

         */

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList); //[0, 1, 2, 3, 4, 0, 1, 2, 3, 4]

    }
}
