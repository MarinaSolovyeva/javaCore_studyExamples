package StudyExample.IO_NIO_Streams.IO.SerializationInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex6_1_Serialization {
    public static void main(String[] args) {
        List <String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees3.JSON")))
        {
            employees = (ArrayList) inputStream.readObject();//readObject возвращает обджект, поэтому здесь мы проводим кастинг
            //и сохраняем этот список куда-то
            System.out.println(employees);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
