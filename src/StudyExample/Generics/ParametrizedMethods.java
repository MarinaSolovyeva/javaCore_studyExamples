package StudyExample.Generics;

import java.util.ArrayList;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList <Integer> ar1 = new ArrayList<>();
        ar1.add(10);
        ar1.add(20);
        ar1.add(50);
        ar1.add(5);
    }
}

class GenMethod {
    public static <T> T getSecondElement (ArrayList <T>ar) {
        return ar.get (1);
        /*
        в параметрах аррэйлист какого то типа Т. в теле метода я хочу постоянно получать второй элемент.
        T перед getSecond.. - это ретерн тайп нашего метода.
        а <T> - означает что мы используем genetics в методе.
        если убрать generic ,
        компилятор не поймет что такое T перед getSecond.
         */
    }
}