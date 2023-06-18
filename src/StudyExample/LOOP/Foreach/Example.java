package StudyExample.LOOP.Foreach;

public class Example {
    public static void main(String[] args) {

    /* String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"mat analiz", "filosophia"};

        for (String s1:students) {
            for (String s2:exams) {
                System.out.println(s1 + " " + s2); */

        int[] array = {0, 6, 4, 1};
       // хотим заменить все объекта с помощью лупа For
        for (int i = 0; i < array.length; i++) {
            array[i] = 3;
            System.out.print(array[i] + " ");
        }

        int [] array2 = new int [5];
        for (int z=0; z < array2.length; z++) {
            array2[z] = z*10;
        }
        for (int a:array2) {
            System.out.println(a + " ");
        }
    }
}

