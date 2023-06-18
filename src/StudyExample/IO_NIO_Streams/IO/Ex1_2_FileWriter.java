package StudyExample.IO_NIO_Streams.IO;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_2_FileWriter {
    public static void main(String[] args) throws IOException {
        String rumai  = "Много лет размышлял я над жизнью земной \n" +
        "Непонятного нет для меня под луной \n"+
        "Мне известно, что мне ничего не известно, —\n" +
        "Вот последний секрет из постигнутых мной. ";
        String s = "Privet";

        FileWriter writer = null;
        try {

            writer = new FileWriter("test2.txt", true);
            //writer.write(rumai);
            writer.write(s);
            //если уже было что то записано, а я добавляю еще - новый текст перезапишет старый. если я хочу Добавить текст
            //в конец - в параметре writer указываю в append - true


            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();

        }
    }
}
