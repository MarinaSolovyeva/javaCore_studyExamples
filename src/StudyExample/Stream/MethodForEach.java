package StudyExample.Stream;

import java.util.Arrays;

public class MethodForEach {
    public static void main(String[] args) {
        int [] array = {5,8,9,2,56};
        Arrays.stream(array).forEach(el ->
        {el *=2;
            System.out.print(el + " ");});

        System.out.println("__________________________________");

        int [] array2 = {1,6,4,5,6};
        //Arrays.stream(array2).forEach(el -> System.out.print(el + " "));
        Arrays.stream(array2).forEach(System.out::println); // интересный синтаксис. метод референс.
        // даем ссылку на наш метод принтлн, какая ссылка?
        // этот метод находитсяв систем ауте- параметр в принтлн поставить кажд элемент нашего стрима

        Arrays.stream(array).forEach(Utils::myMethod);
        /*
        каждый элеент потока помести в метод майметод в качестве параметре котор находится в классе утилс
         */
    }
}

class Utils {
    public static void myMethod (int a) {
        a = a+5;
        System.out.println("Element = " +a);
    }
}