package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;

public class ToArray{
// to array - object
    // to array - (DataType [] Array) - Datatype
    // позволяет переводить аррэй лист в аррэй

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        Object [] array1 = list1.toArray();
        for (Object o : array1) {
            System.out.print(o + " ");
        }

        System.out.println();
        System.out.println();

        StringBuilder [] array2 = list1.toArray(new StringBuilder[10]); // в параметре указываем массив типа стрингбилдер
        for (StringBuilder sb: array2) {
            System.out.println(sb);
        }
    }
}

