package StudyExample.IO_NIO_Streams.IO.SerializationOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex6_1_Serialization {
    public static void main(String[] args) {
        List <String> employees = new ArrayList<>();
        employees.add("Marina");
        employees.add("Denis");
        employees.add("Ivan");
        employees.add("Elena");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees3.JSON")//создастся файл
        )) {
            outputStream.writeObject(employees);//записываем объект, в параметр передаем наш лист employees
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
