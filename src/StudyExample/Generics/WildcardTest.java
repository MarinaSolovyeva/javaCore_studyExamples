package StudyExample.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();

        List <? extends Number> list20 = new ArrayList<>();
        List <Double> list1 = new ArrayList<>();
        list1.add (3.14);
        list1.add (3.85);
        list1.add (5.86);
        showInfo(list1);

        List <String> list2 = new ArrayList<>();
        list2.add ("Morning");
        list2.add ("Afternoon");
        list2.add ("Evening");
        showInfo(list2);

        ArrayList<Double> ald1 = new ArrayList<>();
        ald1.add(0.1);
        ald1.add(1.9);
        ald1.add(2.5);
        System.out.println(summ (ald1));

    }

    static void showInfo (List <?> list) {
        System.out.println("List contains next elements " + list);
    }


    public static double summ (ArrayList <? extends Number> al) {
        double summ = 0;
        for (Number n : al)
        {summ += n.doubleValue();
        }
        return summ;
    }
}
