package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class isEmpty // проверяет пустой ли аррэй лист.если сайз не равен нулю, пустым он не считается

{

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));


        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println(list.isEmpty());

    }
}
