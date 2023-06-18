package HomeWork.Locale;

import java.util.Locale;

public class Test_1 {
    public static void main(String[] args) {
        Locale current = Locale.getDefault();
        System.out.println("getCountry : " + current.getCountry());
        System.out.println("getISO3Country : " + current.getISO3Country());
        System.out.println("getDisplayCountry : " + current.getDisplayCountry());
        System.out.println("getLanguage : " + current.getLanguage());
        System.out.println("getDisplayLanguage : " + current.getDisplayLanguage());
        System.out.println("getDisplayScript : " + current.getDisplayScript());

    }
}
