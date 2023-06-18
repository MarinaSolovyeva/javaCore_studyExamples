package StudyExample.LOOP.DoWhile;

public class Chas {
    public static void main(String[] args) {
        int chas = 0;

        OUTER:
        do {
            int minuta = 0;

            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;  }

            chas ++;
        }
        while (chas < 24);
    }
}

