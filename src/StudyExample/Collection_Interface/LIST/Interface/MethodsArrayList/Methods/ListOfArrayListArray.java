package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class ListOfArrayListArray {
//эти листы  не могут содержать null

        public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        List <String> list = List.of("odin", "dva", "tri");
        System.out.println("list= "+list); //list= [odin, dva, tri]. важно,что  этот лист неизменемый.
            // в него нельзя ничего добавлять . List <String> list = List.of("odin", "dva", "tri");

        List <String> list2 = List.copyOf(al1);
        System.out.println("list= "+list2); //[one, two, three, four, five]. важно,что  этот лист неизменемый.
            // в него нельзя ничего добавлять


    }
}
