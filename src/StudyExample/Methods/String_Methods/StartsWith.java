package StudyExample.Methods.String_Methods;

public class StartsWith {
    public static void main(String[] args) {
        String s1 = new String ("abcdefgabcd");

        // если вопрос "Стринг s1 начинается с abc?"
        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        // если нужно указать с какого конкретного индекса начать отсчет
        boolean b2 = s1.startsWith("abc", 7);
        System.out.println(b2);
    }
}