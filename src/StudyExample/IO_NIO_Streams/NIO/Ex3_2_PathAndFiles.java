package StudyExample.IO_NIO_Streams.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex3_2_PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Administrator\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\Administrator\\Desktop\\B");

        Files.copy(filePath,directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING); //filepath скопируется по этому пути C:\Users\Administrator
        // \Desktop\M и в названии прибавится test17. если хочу чтобы было другое название, в методе резолв в параметре
        //нужно будет написать нужное имя "Test17.txt"
        System.out.println("Done");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);// -это в случае,если
        // мы хотим перезаписать существующий файл
//
        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("Done");

        //move-перемещает файл,  а не копирует.
        Files.move(filePath, directoryPath.resolve("test15"));
        Files.move(Paths.get("test10.txt"), (Paths.get("test11.txt")));// у Files нет метода rename,
        //но мы можем переместить файл и эту же папку, но с др именем
        System.out.println("Done");

        Files.delete(Paths.get("test5.txt"));
        System.out.println("done");

        Files.delete(directoryPath);//но не можем удалить папку,если она не пуста

    }
}
