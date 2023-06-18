package StudyExample.LOOP.DoWhile;

public class ZadachaUgadayZnachenie {

    public static void main(String[] args)
            throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("Задумана буква, угадайте ее");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println(" Правильно");
            else {
                System.out.println("Извините, нужная буквы находится ");
                if (ch < answer) System.out.println("Ближе к концу алфавита");
                else System.out.println("Ближе к началу алфавита");
                System.out.println("Повторите попытку");
            }

        } while (answer != ch);

    }
}