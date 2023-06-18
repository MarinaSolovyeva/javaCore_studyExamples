package HomeWork.Arrays;

import java.util.Arrays;

public class Sort {
    //создайте класс,в котором есть метод сортировка.
    // инпут параметр - одномерный массив int. метод должен возвращать уже отсортированный по возрастанию массив

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
    class TestArray {
        public static void main(String[] args) {
            int[] array = {-5, 6, 3, 18, 0};
            Sort.sortArray(array);
        }
    }
