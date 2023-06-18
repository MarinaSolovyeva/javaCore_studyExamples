package StudyExample.Methods.String_Methods;

public class Substring {
//кусочек строки

    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        //присвой стрингу s10 кусок стринга s1, начиная с 3 индекса.
        // s1 при этом не меняется вообще(immutable)
        String s10 = s1.substring(3);
        System.out.println(s10); //defgabcd
        System.out.println(s1); //abcdefgabcd

        //вариант когда указываем начало  и конец, при этом конец уже не включен!!
        String s11 = s1.substring(3, 7);
        System.out.println(s11); //defg //7 символ не включается сюда
        System.out.println(s1); //abcdefgabcd

        // чтобы d вошел тоже, нужно писать 11, хотяя элемента с индексом 11 у нас не существует
        String s13 = s1.substring(3, 11);
        System.out.println(s13); //defgabcd

    }
}