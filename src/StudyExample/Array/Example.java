package StudyExample.Array;

public class Example {
    //написать метод кот прин в параметр массив и выводит на экран наиб и наим эл
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальный элемент " + min);
        System.out.println("Максимальный элемент " + max);

    }

    public static void main(String[] args) {
        double array1 [] = {1.05, -3.14, 6.0, 9.19, -3.00};
        maxMin(new double[] {2.5, -1.3});
    }

}
