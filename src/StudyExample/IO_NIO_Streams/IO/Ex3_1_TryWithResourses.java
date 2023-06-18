package StudyExample.IO_NIO_Streams.IO;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_1_TryWithResourses {
    public static void main(String[] args) throws IOException {
        String rumai  = "Много лет размышлял я над жизнью земной \n" +
                "Непонятного нет для меня под луной \n"+
                "Мне известно, что мне ничего не известно, —\n" +
                "Вот последний секрет из постигнутых мной. ";
        String s = "Privet";

        try (FileWriter writer=new FileWriter("test2.txt", true)){
            /* В круглых скобках указываем ресурсы , которые после срабатывания нашего кода будут автоматически закрыты
             После компиляции java переведет его в обычный TryCatchFinally*/
            System.out.println("Done");
        }
    }
}
