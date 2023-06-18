package StudyExample.Regex;

import java.util.Arrays;

public class Ex1_5_MatchesSplit {
    public static void main(String[] args) {
        String s1 = "Alexandr Petrov +79263548675 neo@yandex.ru neo@yandex.ru Julia Filippova +96352584678 neo@yandex.ru juloij@mail.ru Maria Krasnova " +
                "+74596251542 nurjjkhskd@gmail.com";
        String s2 = "neo@yandex.ru";
        boolean result = s2.matches("\\w+@\\w+\\.(ru|com)");
        System.out.println(result);//true. но если в s2 будет 2 почты, будет false

        String [] array = s1.split(" ");
        System.out.println(Arrays.toString(array));

    }
}