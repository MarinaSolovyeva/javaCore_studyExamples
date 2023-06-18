package StudyExample.IO_NIO_Streams.IO;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_1_FileWriter {
    public static void main(String[] args) throws IOException {
        String rumai  = "Много лет размышлял я над жизнью земной \n" +
        "Непонятного нет для меня под луной \n"+
        "Мне известно, что мне ничего не известно, —\n" +
        "Вот последний секрет из постигнутых мной. ";

        FileWriter writer = null;
        try {
            // writer = new FileWriter("C:\\Users\\Administrator\\Desktop\\test1.txt"); - в параметр передаю месторасположение
            //это передан абсолютный путь

            writer = new FileWriter("test2.txt");//а могу написать вот так, и тогда в корне нашего проекта появляется файл
            //а здесь передан относительный путь - относительно чего? относительно корня нашего проекта

            for (int i = 0; i < rumai.length(); i++) {
                writer.write(rumai.charAt(i)); // вызываю метод write и посимвольно передаю в файл данные
            }
            //вместо for loop можно было написать просто так: writer.write(rumai) - но все равно java дробила ы текст
            // на символы,и это не было бы очень эффективно
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();//стримы нужно закрывать с помощью метода close, обычно это делаетсяв finally блоке
            //если стрим не закрыть, в файл ничего не запишется

        }
    }
}
