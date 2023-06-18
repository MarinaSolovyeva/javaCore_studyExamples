package StudyExample.Methods.String_Methods;

public class Replace{
    // всегда создает новый объект!

    public static void main(String[] args) {
        //позволяет один символ заменить на другой
        String s1 = new String ("privet");
        String s14 = s1.replace('r', 'Z');
        System.out.println(s14);

        //позволяет стринг заменить на стринг
        String s15 = s1.replace("vet", "vivka");
        System.out.println(s15);
    }
}
