package HomeWork.Arrays;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        String text = " Hello my have dear friend have my have a nice day ";
        String [] duplicateValues = text.split (",?\\s+"); //мы не знаем, есть ли запятая? знак вопроса проверяет это

;
        for (int i = 0; i < duplicateValues.length; i++) {
            if (i>0 && Arrays.asList(duplicateValues).contains("i")) continue;
            System.out.println(duplicateValues[i]);
//            if (Arrays.asList(duplicateValues).contains(i);
//            { System.out.println(duplicateVal);}

        }
        }}

