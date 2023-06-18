package StudyExample.StringBuilder;

public class Example {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1 = "+sb1);
        System.out.println("sb2 = "+sb2);

        /* на выходе
        sb1 = 1234567
        sb2 = 1234567
        то есть сначала есть sb1 = 123,потом к нему добавляется 45, далее sb2 начинает
        ссылаться на этот объект, добавляя 6 и 7, итого  оба объекта имеют одинаковые значения */

    }
}
