package StudyExample.Methods.String_Methods;

import java.util.Locale;

public class toLowerUpperCase {

    public static void main(String[] args) {
        String s = "PriVeT";

        // делает все буквы маленькими. если будет что то кроме букв, на них это не распространится.
        String s2 = s.toLowerCase();
        System.out.println(s2);

        // делает все буквы большими. если будет что то кроме букв, на них это не распространится.
        String s3 = s.toUpperCase();
        System.out.println(s3);
    }
}
