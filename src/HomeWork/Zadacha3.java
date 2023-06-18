package HomeWork;

public class Zadacha3
    /*{int a = 1;
    static int a = 2; // ошибка компиляции - мы не можем использовать две переменные с одинаковым идентификатором
    void abc (int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Zadacha3 z = new Zadacha3();
        z.abc (3);
    }
} */
/*{
    int a=1;
    static int b = 2;
    static void abc (final int a) {
        System.out.println(a);
        System.out.println(Zadacha3.b);
    }

    public static void main(String[] args) {
        abc(5); // резалт 5 и 2
    }
}*/

{
    int a=1;
    static int b = 2;
    void abc (int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Zadacha3.b);
    }

    public static void main(String[] args) {
        Zadacha3 z = new Zadacha3();
        z.abc (4);
    }
}

