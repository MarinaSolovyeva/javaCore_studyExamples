package HomeWork.Locale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

//вывести все возможные форматы дат
public class DataFormatMain2 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "---> " + format.format(date));
        }
    }
}
