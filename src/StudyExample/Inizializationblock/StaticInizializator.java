package StudyExample.Inizializationblock;

public class StaticInizializator //
//сначала срабатывают статик, только один раз , в момент запуска, потом нестатик блоки инициализации, а потом конструкторы

{

    {
        System.out.println("Eto itir blok3"); // 3. выполняется блок инициализации
        // 8. выполняется блок инициализации
    }
    StaticInizializator () {
        System.out.println("Eto konstructor1");// 6. выполняется конструктор
        //11. выполняется конструктор
    }

    StaticInizializator (int a) {
        this();
        System.out.println ("Eto konstructor2");// 7. выполняется конструктор
        //12. выполняется конструктор
    }

    {
        System.out.println("Eto itir blok1"); // 4. выполняется блок инициализации
        // 9. выполняется блок инициализации
    }
    static {
        System.out.println("Eto static itit blok1"); // 1. выполняется static блок инициализации

    }
    {
        System.out.println("Eto itir blok2"); // 5. выполняется блок инициализации
        // 10. выполняется блок инициализации
    }
    static {
        System.out.println("Eto static itit blok2"); // 2. выполняется static блок инициализации

    }

    public static void main(String[] args) {
        StaticInizializator b1 = new StaticInizializator(); // 1. создается объект
        StaticInizializator b2 = new StaticInizializator(); // 4. создается второй объект
    }
}