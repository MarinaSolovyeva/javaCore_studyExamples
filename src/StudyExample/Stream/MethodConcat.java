package StudyExample.Stream;

import java.util.stream.Stream;

public class MethodConcat {
    public static void main(String[] args) {


    Stream <Integer> myStream1 = Stream.of(1,5,8,7,4,2);
    Stream <Integer> myStream2 = Stream.of(4,5,2,1,0,3);
    Stream <Integer> myStream4 = Stream.concat(myStream1, myStream2);//статический метод
    myStream4.forEach(System.out::println); // объединяет стримы
        //его нельзя указывать в цепочке методов

}
}