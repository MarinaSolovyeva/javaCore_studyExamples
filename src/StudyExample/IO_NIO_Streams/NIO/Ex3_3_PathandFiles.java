package StudyExample.IO_NIO_Streams.NIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex3_3_PathandFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        Files.createFile(filePath);
        String dialog = "-Priver\n -Privet\n-Kak dela?\n-Horosho, spasibo, a y tebya?\n-Y mmenya toje horosho";
        Files.write(filePath,dialog.getBytes());
        Files.readAllLines(filePath);

        List <String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
