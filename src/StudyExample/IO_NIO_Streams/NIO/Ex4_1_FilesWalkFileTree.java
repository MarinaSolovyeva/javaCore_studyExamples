package StudyExample.IO_NIO_Streams.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex4_1_FilesWalkFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Administrator\\Desktop\\X");
        Files.walkFileTree(path, new MyFileVisitor());

    }
}


class MyFileVisitor implements FileVisitor <Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to directory " + dir);//dir - из параметра
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name" + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visition file" + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory" + dir);
        return FileVisitResult.CONTINUE;
    }
}