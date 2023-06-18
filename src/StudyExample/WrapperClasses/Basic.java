package StudyExample.WrapperClasses;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();// int я здесь написать не могу, тк аррэйлист содержит только референс типы данных
        list.add(5);//автобоксинг - автоматический процесс конвертирования примитивного типа данных в референс тип данных
        // инт 5 был конвертирован в интеджер и добавлен в аррэйлист
        //только инт может автоматически конвертироваться в интежер

        int a = list.get(0);// Unboxing
        // лист гет 0  возвращает объект типа интеджер со значением 5,
        // затем этот объект анбокситься и приравнивается к примитивному типу данных инт

        //Integer b = new Integer();
       // int c = b; // здесь бы тоже происходил процесс анбоксинга

        //метод Parse - относиться ко всем wrapper классам. он статик
        String s1 = "50";
        int i1 = Integer.parseInt(s1);
        //и вот мой стринг превратиться в инт
        // если поставить пробел которого не может быть в инте- будет эксепшен

        //Метод ValueOf - позволяет создавать новый объект wrapper класса того типа на котором данный метод был вызван
        Integer i3 = Integer.valueOf(10);
        // создали объект i3 типа интеджер со значением 10
    }
}
