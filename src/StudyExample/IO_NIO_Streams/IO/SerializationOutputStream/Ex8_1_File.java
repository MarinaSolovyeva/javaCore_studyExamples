package StudyExample.IO_NIO_Streams.IO.SerializationOutputStream;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex8_1_File {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt"); //самый частый конструктор
        File folder = new File("C:\\Users\\Administrator\\Desktop\\A");
        File file2 = new File("C:\\Users\\Administrator\\Desktop\\B\\test20.txt");
        File folder2 = new File("C:\\Users\\Administrator\\Desktop\\B");


                //getAbsolutePath(): можем получить абсолютный путь
        System.out.println("file.getAbsolutePath "+file.getAbsolutePath());//C:\Projects\MySelf\test2.txt
        System.out.println("folder.getAbsolutePath "+folder.getAbsolutePath());//C:\Users\Administrator\Desktop\A

                //isAbsolute(): проверяет, наш путь абсолютный?
        System.out.println("file.isAbsolute() "+file.isAbsolute());//false
        System.out.println("folder.isAbsolute() "+folder.isAbsolute());//true

                //isDirectory(): проверяет, наш файл директорией, папка это или нет?
        System.out.println("file.isDirectory() "+file.isDirectory());//false
        System.out.println("folder.isDirectory() "+folder.isDirectory());//true

                //exists(): проверяет, наш файл существует?
        System.out.println("file.exists() "+file.exists());//true
        System.out.println("folder.exists() "+folder.exists());//true

                //exists(): проверяет, наш файл существует?
        System.out.println("file.exists() "+file.exists());//true
        System.out.println("folder.exists() "+folder.exists());//true

                //createNewFile(), mkdir() проверяет, наш файл существует?
        System.out.println("file2.createNewFile() "+ file2.createNewFile());//true
        System.out.println("folder2.mkdir() "+folder2.mkdir());//makedirectory

                //length() проверяет размер
        System.out.println("file2.length() "+ file2.length());//
        System.out.println("folder2.length() "+folder2.length());//

                //delete() - сможем удалить папку только в том случае, если она пуста
        System.out.println("file2.delete() "+ file2.delete());//
        System.out.println("folder2.delete() "+folder2.delete());//
        System.out.println("folder.delete() "+folder.delete());//

                //listFiles() - проверяет пустая ли папка - возвращает массив типа File
        File []  files = folder.listFiles();
        System.out.println(Arrays.toString(files));


        System.out.println("file.isHidden() "+ file.isHidden());//isHidden() - скрыта ли наша папка
        System.out.println("file.canRead() "+ file.canRead());//isHidden() - имеем ли право на чтение
        System.out.println("file.canWrite() "+ file.canWrite());//isHidden() - имеем ли право на запись
        System.out.println("file.canExecute() "+ file.canExecute());//isHidden() - имеем ли право на запуск

    }
}
