package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;
import java.util.ArrayList;
public class Get // возвращает тип данных, в параментре пишу индекс, который хочу получить

{
    public static void main(String[] args) {
//  все тоже самое можно делать с ArrayList

        ArrayList<String> list = new ArrayList<>();

        list.add("poka"); // нулевой индекс
        list.add("poka1");// первый индекс
        list.add("poka2");// второй индекс
        list.add(1, "Hello"); //добавляем хэллоу на первый индекс

        System.out.println(list.get(3));// poka 2
        // если ввести значение которого нет, будет exception

        //c помощью for также можно вывести элементы листа
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}

