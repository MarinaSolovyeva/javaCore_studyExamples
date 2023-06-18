package StudyExample.Inizializationblock;

public class Basic {
    Basic () {
        System.out.println("Eto konstructor");// 3. выполняется конструктор
                                              //6. выполняется конструктор
    }
    {
        System.out.println("Eto itir blok"); // 2. выполняется блок инициализации
                                             // 5. выполняется блок инициализации
    }

    public static void main(String[] args) {
        Basic b1 = new Basic(); // 1. создается объект
        Basic b2 = new Basic(); // 4. создается второй объект
    }
}
