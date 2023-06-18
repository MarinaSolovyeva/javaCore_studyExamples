package HomeWork.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DataFormatMain {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, new Locale("be", "BY"));
        String dateStr = dateFormat.format(new Date());
        System.out.println(dateStr);
        try {
            Date date = dateFormat.parse("аўторак, 17 сакавіка 2020 г., 17:58:17");
            System.out.println(date);
            DateFormat dateFormatCa = DateFormat.getDateTimeInstance(
                    DateFormat.SHORT, DateFormat.SHORT, Locale.CANADA);
            System.out.println(dateFormatCa.format(date));
            DateFormat dateFormatFr = DateFormat.getDateTimeInstance(
                    DateFormat.SHORT, DateFormat.SHORT, Locale.FRANCE);
            System.out.println(dateFormatFr.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}