package StudyExample.Inizializationblock;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Example2 {
    int a = 3; // 1. сначала принимает значение

    Example2() {
        a = 4; // 3. заходим в конструктор. в аутпуте - 4
    }

    {
        a = 5; // 2. заходим в блок инициализации
    }
}


class A {
    static final int b;

    static {b=10;} //можно написать и так. сначала сработает объявление переменной,а потом статический инициалайзер
    //в статич инициалайзере нельзя обращаться к нестатическим переменным
}

class C {
    String s = "ok"; //3.0. присваивается значение s
    {System.out.println(s);} //3.1. выводится значение s

    static int i = 0; // 0. срабатывает создание статической переменной
    static {System.out.println(i);}  // 1. выводится на экран ее значение

    static {i = i+1;System.out.println(i);} // 2. i увеличивается на единицу и выводится на экран

    C() {System.out.println("eto konstruktor");} //4. срабатывает конструктор

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.i);
    }
}

class D {
    String s = "ok"; //3.0. присваивается значение s
    {System.out.println(s);} //3.1. выводится значение s

    static int i = 0; // 0. срабатывает создание статической переменной
    static {System.out.println(i);}  // 1. выводится на экран ее значение

    {i = i+1;System.out.println(i);} // 4. i увеличивается на единицу и выводится на экран

    D() {System.out.println("eto konstruktor");} //5. срабатывает конструктор

    public static void main(String[] args) {
        System.out.println("Privet vsem"); //2. выводится на экран текст
        D d = new D();

    }
}


class F {
    static {abc(2);}

    static void abc(int a) {System.out.println(a + " ");}
    //1. сначала выполняется статик инициализатор и выводится значение . 2

    F() {abc(5);} // 6. в последнюю очередь срабатывает конструктор

    static {abc(4);} // 2. следующий статич инициализатор вызывает метод с параметром 4

    {abc(6);} //4.  метод в параметре вызывает 6, выводится 6

    static{new F();} // 3. внутри статического инициализатора происходит создание объекта D. после создания объекта
        // должны начать выполняться все non static инициализаторы

    {abc(8);}//5.  теперь срабатывает след non static инициализатор , и выводится 8


    public static void main(String[] args) {

    }
}