package StudyExample.Inizializationblock;

public class Example {
    int a = 3; // 1. сначала принимает значение

    Example () {
        a = 4; // 3. заходим в конструктор. в аутпуте - 4
    }

    {
        a= 5; // 2. заходим в блок инициализации
    }

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println(e.a);
    }
}
