package StudyExample.IO_NIO_Streams.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Ex1_1_ChannelBuffer {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw");
             /*из самого файла randomAccessFile мы получаем канал для связи с этим файлом,
             channel тоже ресурс, поэтому можем записать его в блок TryWithResourses */
             FileChannel channel = randomAccessFile.getChannel();)

        {
/* Теперь будем читать из файла , нам нужно создать Buffer , в данном примере создаем его меньшего размера чем стих */
            ByteBuffer buffer = ByteBuffer.allocate(25);
/* Если попробуем добавить еще байты, будет выброшен exception */

            StringBuilder stix = new StringBuilder();

            int byteRead = channel.read(buffer);//возвращает кол-во прочитанных байт,записываем результат в переменную
            while (byteRead > 0 ) { //читаем до тех пор пока есть что читать
                System.out.println("Read " + byteRead); //каждый раз выводим на экран количество прочитанных байтов

            buffer.flip(); /*переводится как кувырок, сальто
            теперь читаем инфо из буффера по одному байту за раз, тк имеем дело с текстом, можем делать кастинг до чра.
            пока у беффера есть что читать, сть какой тоостаток, читаем с помощью метода buffer.get,
            и присоединяем в стринг билдер
             */
                while (buffer.hasRemaining()) {
                    stix.append((char)buffer.get());
                }

             /* после того как прочитали первые 25 байт, должны записать след 25, надо подготовить буффер к записи*/

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stix);


            String text = "\nPrivet";
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);
            /* в метод wrap передаем массив байтов, и сразу записываем инфо из буффера в файл. не надо вручную указывать
            размер буффера, указывать флип. это все делает метод wrap*/




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
