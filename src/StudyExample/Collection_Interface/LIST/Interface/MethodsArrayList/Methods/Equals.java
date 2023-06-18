package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;

public class Equals // метод equals в Аррэй Листе перезаписан
    // Два аррэй листа считаются равными , если они содержат одинаковые элементы. Порядок важен!!
        // если элементы одинаковые но на разных местах , будет false
{
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        ArrayList<String> list2 = list1;

        System.out.println(list1.equals(list2)); //true

        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);

        System.out.println(list1.equals(list3)); //true

        ArrayList<String> list4 = new ArrayList<>();
        list4.add(s3);

        System.out.println(list1.equals(list4)); //false;

    }
}
