package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumalator, el) -> accumalator * el).get();
        System.out.println(result);

       /* с помощью метода стрим создаем поток. работаем с двумя параметрами
        accumulator = то что что-то накапливает.  сразу присваивается первое значение потока,
        второе значение присваивается элементу. затем происходит умножение аккумулятора на элемент и передача
        произведения аккумулятору, а след элемент назначается элементу, в итоге аккумулятору возвращается значение 960
        5 40 80 320 960

        element = 8 2 4 3

        reduce возвращает optional, что такое опшэнл
        объект тип опшэнл делает рап в данном случае объект интеджера
        опшэнэл оборачивает это значение, является контейнером
        опшэнэл может содержать налл энд нот налл значения*/

        List<Integer> list100 = new ArrayList<>();
     /*    int resul100 = list100.stream().reduce ((accumulator, el) -> accumulator*el).get();
         редьюс возвращает значение произв элементов.
         стрим излиста который не содержит никаких значений,
         поэтому и стрим не содержит никакиъ элементов. если вывести result100 на экран,
         будет эксепшн no such element. потому что в коде мы не обезопасились и сразу попытались вызвать метод get
         а омогли не вызывать get, а написать так*/

        Optional<Integer> op = list100.stream().reduce((accumulator, el) -> accumulator * el);
        if (op.isPresent()) {
            System.out.println(op.get());
        } else {
            System.out.println("Not present");}

        /*Могли не вызывать get, а записать редьюс в переменную Optional,
        is Present- метод который проверяет присутствует значение или нет. если присутствует
        то через o.get() - выводим это значение */

        int result2 = list.stream().reduce (1, (accumulator, el) -> accumulator*el);

        /* можем подставить 1, это означает  первичным значением аккумулятора, начальным его значением,
        а не первым элементом. при таком написании уже нет варианта что мы получим налл, как минимум будет 1, и в таком
        случае заканчивать код методом get() нет необходимости
         */

        List <String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("Poka");
        list3.add("Ok");
        list3.add("Morning");

        String result3 = list3.stream().reduce((a, e) -> a+" "+e).get();
        System.out.println(result3);



    }
}