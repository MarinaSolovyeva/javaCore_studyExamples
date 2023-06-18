package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class IndexOf //возвращает индекс самого первого обнаруженного элемента
{

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));


        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println(" ");
        System.out.println(list.indexOf("ok")); // 2

    }
}

