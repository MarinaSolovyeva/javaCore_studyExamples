package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.*;
import java.util.Arrays;

public class AsList {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        StringBuilder [] array = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);

        }
    }


