package StudyExample.IO_NIO_Streams.IO;

import java.io.*;

public class Ex4_2_BufferedReaderWriter {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {

            String line;
            while ((line= reader.readLine())!=null) { //метод readLine читает сразу строку
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
