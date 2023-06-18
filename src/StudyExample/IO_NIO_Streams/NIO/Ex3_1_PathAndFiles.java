package StudyExample.IO_NIO_Streams.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Ex3_1_PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Administrator\\Desktop\\M");

        // getFileName - возвращает имя файла или директории
        System.out.println(filePath.getFileName());//test15.txt
        System.out.println(directoryPath.getFileName());//М
        System.out.println("_________________________");
        // getParent
        System.out.println(filePath.getParent());//null
        System.out.println(directoryPath.getParent());//C:\Users\Administrator\Desktop
        System.out.println("_________________________");

        //getRoot
        System.out.println(filePath.getRoot());//null
        System.out.println(directoryPath.getRoot());//C:\
        System.out.println("_________________________");

        //isAbsolute
        System.out.println(filePath.isAbsolute());//false
        System.out.println(directoryPath.isAbsolute());//true
        System.out.println("_________________________");

        //toAbsolute
        System.out.println(filePath.toAbsolutePath());//C:\Projects\MySelf\test15.txt
        System.out.println(directoryPath.toAbsolutePath());//C:\Users\Administrator\Desktop\M
        System.out.println("_________________________");

        //resolve - объединяем пути
        System.out.println(directoryPath.resolve(filePath));//C:\Users\Administrator\Desktop\M\test15.txt

        //relativize - возвращает относительный путь anotherPath относительно directoryPath
        Path anotherPath = Paths.get("C:\\Users\\Administrator\\Desktop\\M\\N\\Z\\P");
        System.out.println(directoryPath.relativize(anotherPath));//N\Z\P
        System.out.println("_________________________");

        //          методы класса Files

        //exist , createDirectory
        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        //isReadable, isWritable, isExecutable
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));
        System.out.println("_________________________");

        //isSamePath - проверяет ссылаются ли оба пути на один и тот же файл
        Path filePath2 = Paths.get("C:\\Projects\\MySelf\\test15.txt");
        System.out.println(Files.isSameFile(filePath, filePath2));//true
        System.out.println("_________________________");

        //size
        System.out.println(Files.size(filePath));//33 bytes
        System.out.println("_________________________");

        //getAttribute
        System.out.println(Files.getAttribute(filePath, "creationTime")); //2022-08-15T11:44:24.3172594Z
        //атрибутов много , пишутся как стринг, но писать надо без ошибок. при необходимости загуглить
        //если хотим рассмотреть все атрибуты то
        Map <String, Object> attributes = Files.readAttributes(filePath, "*"); //звездочка говорит о всех атрибутах, возвр Map
        for (Map.Entry <String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
        /*lastAccessTime:2022-08-15T11:49:13.7990507Z
lastModifiedTime:2022-08-15T11:49:13.7990507Z
size:33
creationTime:2022-08-15T11:44:24.3172594Z
isSymbolicLink:false
isRegularFile:true
fileKey:null
isOther:false
isDirectory:false */

    }
}
