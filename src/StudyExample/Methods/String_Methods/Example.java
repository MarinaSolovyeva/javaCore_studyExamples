package StudyExample.Methods.String_Methods;

public class Example {
    public static void main(String[] args) {
        String text = " Hello my my dear friend have have a nice day ";
        String [] duplicateValues = text.split (",?\\s+"); //мы не знаем, есть ли запятая? знак вопроса проверяет это
        for (int i = 0; i < duplicateValues.length; i++) {
            if(i>0 && duplicateValues [i].equals(duplicateValues [i-1])) {
                continue;
            }
            System.out.println(duplicateValues[i]);
        }
    }
}
