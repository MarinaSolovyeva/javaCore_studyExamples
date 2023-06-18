package StudyExample.VariableArguments;

public class Example {

    static void abc(int a) {
        System.out.println("Hello");
    }

    static void abc(int... a) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        abc(5); /* в аутпуте получим хэлло. почему? потому что совпадения есть,
        компилятор их видит, но они не такие явные, поэтому он выдает не ошибку,
        а выполняет метод с наиболее точным совпадением */
    }

}

