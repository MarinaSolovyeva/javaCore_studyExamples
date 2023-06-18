package StudyExample.Methods.String_Methods;

public class isBlankIsEmptyStrip {
    public static void main(String[] args) {
        //isBlank - выдает тру если пробелы, табы и тд, фолс- если есть др значения
        String s1 = "Privet";
        String s2 = " ";
        System.out.println(s1.isBlank());  //false
        System.out.println(s2.isBlank());  //true

        //isEmpty - true только тогда, когда стринг пустой
        String s3 = " ";
        System.out.println(s3.isEmpty()); //false

        //strip, stripLeading, stripTrailing
        //аналог трим, но рекомендуется использовать strip

        String s4 = "   Privet         ";
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());//удаляет пробелы только в начале стринга
        System.out.println(s4.stripTrailing());//удаляет пробелы только в конце стринга




    }
}
