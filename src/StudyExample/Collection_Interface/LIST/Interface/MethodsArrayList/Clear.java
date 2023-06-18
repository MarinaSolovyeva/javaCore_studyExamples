package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class Clear
    // позволяет быстро очистить наш аррэй лист
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String sb1 = new String("hello");
        String sb2 = new String("ok");
        String sb3 = new String("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (String sb : list) {
            System.out.print(sb + " ");
        }
        list.clear();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        for (String sb : list) {
            System.out.print(sb + " ");
        }
    }
}