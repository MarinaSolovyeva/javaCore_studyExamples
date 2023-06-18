package StudyExample.IO_NIO_Streams.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex2_1_ChannelBufferMethods {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);//записали в буффер 5 байт и вызываем метод flip
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

            buffer.rewind(); //поместит позицию снова на ячейку 0
            System.out.println((char) buffer.get()); //a

            System.out.println("___________________________________");
            // compact - если не хотим чтобы метод clear затирал наши непрочтенные элементы.копирует непрочитанные
            //элементы в начало буффера
            buffer.compact();
            channel.read(buffer);//снова читаем инфо из файла в буффер
            buffer.flip(); //чтоб могли читать из буффера, переходим в reading mode
            while(buffer.hasRemaining()) {
                System.out.println((char)buffer.get()); // b c d e f
            }

            buffer.clear();
            //mark and reset - читаем оставшиеся 4 символа
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get()); //g
            buffer.mark();// ставим отметку на след символе h
            System.out.println((char)buffer.get()); //h
            System.out.println((char)buffer.get());//i
            buffer.reset();//возвращаемся к позиции где стоял h
            System.out.println("___________________________________");
            while(buffer.hasRemaining()) {
                System.out.println((char)buffer.get()); // b c d e f
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
