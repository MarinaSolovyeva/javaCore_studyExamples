package HomeWork.Locale;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test_2 {
        public static void main(String[] args) throws UnsupportedEncodingException {
            printInfo("", "");
            printInfo("en", "US");
            printInfo("рус", "Russia");
        }

        private static void printInfo(String language, String country)
                throws UnsupportedEncodingException {
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("text", current);
            String s1 = rb.getString("str1");

            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
            System.out.println();
        }
    }

