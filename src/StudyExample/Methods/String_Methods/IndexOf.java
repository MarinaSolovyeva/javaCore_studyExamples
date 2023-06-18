package StudyExample.Methods.String_Methods;

public class IndexOf {
    public static void main(String[] args) {
        //indexOf
        String s1 = new String ("privet");
        int a = s1.indexOf('t'); //5
        System.out.println(a);

        //если считать часть слова, считается до перв совпадения
        int a2 = s1.indexOf("vet"); //3
        System.out.println(a2);

        int a3 = s1.indexOf("Z"); //  если вывести то,чего нет, всегда будет -1
        System.out.println(a3);
    }
}

// рассмотрим overload методы, работает как с char так и string

class IndexOfOverload {
    public static void main(String[] args) {
        String s1 = new String ("abcdefgabcd");
        //нужно найти на каком индексе находится a , начиная с 5
        int a4 = s1.indexOf("a", 5);
        System.out.println(a4); //-7
    }
}