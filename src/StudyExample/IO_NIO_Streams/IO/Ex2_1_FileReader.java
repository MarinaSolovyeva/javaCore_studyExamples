package StudyExample.IO_NIO_Streams.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_1_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null ;
        try {
            fileReader = new FileReader("test2.txt");
            int character;
            while ((character = fileReader.read()) !=-1){
                System.out.print((char)character);

            }// читаем каждый символ из файла тест 2 и передаем character до тех пор пока он не равен -1.
            //на экран потом выводим не просто инт,а делаем кастинг до чара
            System.out.println();
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fileReader.close();
        }
    }
}
