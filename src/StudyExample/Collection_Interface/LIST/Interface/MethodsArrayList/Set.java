package StudyExample.Collection_Interface.LIST.Interface.MethodsArrayList;

import java.util.ArrayList;

public class Set
/*
 указываю индекс, и элемент который хочу поместить на этот индекс.
 работает как replace, он заменяет имеющийся на элемент*/ {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("poka"); // нулевой индекс
        list.add("poka1");// первый индекс
        list.add("poka2");// второй индекс
        list.add(1, "Hello"); //добавляем хэллоу на первый индекс
        for (String s2 : list) {
            System.out.print(s2 + " ");}

            System.out.println();

            list.set(1, "!!!");
            for (String s1 : list) {
                System.out.print(s1 + " "); //меняем Hello на !!!
            }
        }
    }


