package StudyExample.Archive;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Program {
    public static void main(String[] args) {

        String filename = "C:\\SomeDir\\notes.txt";
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\SomeDir\\output.zip"));
            FileInputStream fis= new FileInputStream(filename);)
        {
            ZipEntry entry1=new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
