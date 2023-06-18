package StudyExample.Methods.String_Methods;

public class endsWith {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        // если вопрос "Стринг s1 заканчивается на cd?" - char писать нельзя
        boolean b2 = s1.endsWith("cd");
        System.out.println(b2); //true
    }
}