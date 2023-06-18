package StudyExample.LOOP.For;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i == 87) {
                continue; //87 выпадает из списка
            }
            System.out.println(i);
        }
    }
}