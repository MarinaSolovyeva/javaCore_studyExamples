package StudyExample.Methods.String_Methods;

public class Trim {
    public static void main(String[] args) {
// trim - убирает пробелы по бокам "  abcd    ", но не трогает проблы которые внутри текста )
        String s1 = new String ("  abcde   fgabcd  ");
        String s12 = s1.trim();
        System.out.println(s12);
    }
}
