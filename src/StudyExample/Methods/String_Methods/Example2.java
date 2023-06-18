package StudyExample.Methods.String_Methods;

import java.util.Arrays;
import java.util.Collections;

public class Example2 {
    public static void main(String[] args) {
        String text = " Hello my have dear friend have my have a nice day ";
        String [] duplicateValues = text.split (",?\\s+"); //мы не знаем, есть ли запятая? знак вопроса проверяет это
        for (int i = 0; i < duplicateValues.length; i++) {
            Arrays.sort(duplicateValues);
            if(i>0 && duplicateValues [i].equals(duplicateValues [i-1])) {
                continue;
            }
            System.out.println(duplicateValues[i]);
        }
    }
}
