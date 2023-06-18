package StudyExample.LOOP.Foreach;

public class DoubleArray {
    public static void main(String[] args) {
        int [][] array = {{3,7,8},{4,5},{9,4,4,6,8,3}};
        /*for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                System.out.println(array [i] [j] + " ");*/

        for (int [] array2:array) {
            for (int a:array2) {
                System.out.print(a + " "); //3 7 8 4 5 9 4 4 6 8 3
            }
        }
    }
}
