package StudyExample.IO_NIO_Streams.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5_1_FileInputStreamOutputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\D.jpg");
             FileOutputStream outputStream = new FileOutputStream("D.jpg");
        ) {

            int i;
            while ((i = inputStream.read())!=-1) {
                outputStream.write(i);

            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
