package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class toString  // позволяет выводить на печать значения аррэй листа без использования for each


{

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));

        System.out.println(list.toString());

    }
}
