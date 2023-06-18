package StudyExample.IO_NIO_Streams.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex4_3_FilesWalkFileTree_Delete {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Administrator\\Desktop\\CopyHere");

    }
}

class MyFileVisitors3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete file name" + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete Directory" + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}