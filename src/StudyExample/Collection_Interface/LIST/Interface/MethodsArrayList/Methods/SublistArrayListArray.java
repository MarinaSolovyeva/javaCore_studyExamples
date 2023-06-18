package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class SublistArrayListArray{
    //из текущего аррэй листа вытаскивает открывок  и создает отдельный лист
/*структура саблист не существует сама по себе. это лишь вью, отображение нашего аррэй листа. если мы добавим
что то в лист, в аррэй лист  это тоже добавится, но на тот же индекс, что и в саблисте.
если что то добавить в аррэй лист , а потом вывести лист на экран, будет эксешен -
все дейтвия необходимо выполнять над саблистом

 */
        public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        System.out.println("al1 = " +al1); //[one, two, three, four, five]

        List <String> sublist= al1.subList(1,4); // - 4 элемент не включается
        System.out.println(sublist);


    }
}
