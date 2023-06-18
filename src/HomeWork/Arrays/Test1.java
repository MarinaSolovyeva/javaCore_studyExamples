package HomeWork.Arrays;

public class Test1 {
    public static void main(String[] args) {
    /*Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
    int [] array;
    array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] =(int) Math.round( 1_000_000 * Math.random());
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];

                avg += array[i]/array.length;
            }
        }
        System.out.println("Max " +max);
        System.out.println("Min " +min);
        System.out.println("Avg " +avg);
    }

 }