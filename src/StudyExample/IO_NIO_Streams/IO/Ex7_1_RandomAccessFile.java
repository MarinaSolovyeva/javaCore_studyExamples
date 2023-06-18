package StudyExample.IO_NIO_Streams.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex7_1_RandomAccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw" )) {
            //mode - режим работы, r-read, w- write, rw - read+write

            int a = randomAccessFile.read();//read прочитает 1 байт на позиции где стоит наш поинтер и сдвигает его, указатель
            //в самом начале он стоит перед самым первым байтом.read возвращает Int, поэтому чтобы вывести буквы , будем
            //использовать кастинг
            System.out.println((char)a);

            String s1 = randomAccessFile.readLine(); //можем прочесть всю строку , но начиная с той точки,где остановился pointer

            randomAccessFile.seek (101); //перемещаем pointer на нужную точку
            String s2 = randomAccessFile.readLine();
            System.out.println(s2);

            Long position = randomAccessFile.getFilePointer();// на какой позиции мы сейчас находимся, возвращает лонг
            System.out.println(position);

            //хотим в начало написать привет
//            randomAccessFile.seek(0);
//            randomAccessFile.writeBytes("Privet");// первые 6 байт были заменены на наш стринг, записали поверх существ


            //хотим в конец написать фио автора
            randomAccessFile.seek(randomAccessFile.length()-1);//попали в конец файла
            randomAccessFile.writeBytes("\n\t\t\t\t\t\t\t\t W. Yeats");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
