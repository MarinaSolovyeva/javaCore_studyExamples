package StudyExample.LOOP.Foreach;

public class Basic {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int a:array) {
            /* то есть создаем переменную такого же типа, как наш массив. почему ?
            потому что наша переменная принимает все значения нашего массива,
            именно поэтому у нее должен быть такой же тип данных как у массива*,
            int a:array говорит нам "сначала а примет  значение нулевого элемента нашего массива, затем первого и тд */
            System.out.print(a + " "); //0 6 4 1

        }
        System.out.println();
    }
}
