package StudyExample.IO_NIO_Streams.IO;

import java.io.*;

public class Ex4_1_BufferedReaderWriter {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {
            int character;
            while ((character = reader.read())!=-1) { //пока мы не достигли конца файла, будем сразу записывать его в др файл
                writer.write(character);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
