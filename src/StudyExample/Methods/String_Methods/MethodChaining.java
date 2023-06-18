package StudyExample.Methods.String_Methods;

public class MethodChaining {
    public static void main(String[] args) {
        String S1 = "Hello World";
        String S2 = "Urraaaa";
        // когда друг за другом пишутся методы - Method Chaining, слева направо
        String S3 = S1.concat(S2).trim().replace("Urraaaa", "Урааааааа").substring(6, 10);

        System.out.println(S1.substring(S1.indexOf('W')));//World
    }
}
