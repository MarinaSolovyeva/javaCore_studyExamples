package StudyExample.IO_NIO_Streams.IO.SerializationInputStream;

import StudyExample.IO_NIO_Streams.IO.SerializationOutputStream.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex6_2_Serialization {
    public static void main(String[] args) {
        Employee bestEmployee;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {

            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
