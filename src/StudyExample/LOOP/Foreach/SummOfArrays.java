package StudyExample.LOOP.Foreach;

public class SummOfArrays {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for (int i : array) {
            summa += i;
        }
        System.out.println(summa);
    }
}

