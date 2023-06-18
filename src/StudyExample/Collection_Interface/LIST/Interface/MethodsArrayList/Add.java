package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;
import java.util.ArrayList;
public class Add
    //добавление элемента в массив

    /*add (DataType element) - boolean
     add (int index,Datatype element) - boolean - здвесь можем указать на какой конкретно индекс хотим добавить элемент
     элемент добавляется на последующую позицию*/

{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka"); // нулевой индекс
        list.add("poka1");// первый индекс
        list.add("poka2");// второй индекс
        list.add(1,"Hello"); //добавляем хэллоу на первый индекс
        //list.add (5, "ok") - будет эксепшен, такого индекса у нас нет, такой индекс 5, а размер 4

        for (String s:list) {
            System.out.print(s+ " ");
        }
        System.out.println(" ");

        ArrayList<String> Arraylist2 = new ArrayList<>();
        Arraylist2.add("Morning"); // нулевой индекс
        Arraylist2.add("Afternoon");// первый индекс
        Arraylist2.add("Evening");// второй индекс
        Arraylist2.add(1,"Hello"); //добавляем хэллоу на первый индекс

        for (String s:Arraylist2) {
            System.out.print(s+ " ");
        }
    }
}
