package StudyExample.Array;

public class CompareArrays {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3[] = array2;
        array1 [1] = 0;
        array2 [5-3] = 3;
        //array1[array1.length]= 10; - exception, превышена длина массива




        System.out.println(array1==array2);//false потому что ссылаются на разные объекты
        System.out.println(array1.equals(array2));//false - это означает метод equals не перезаписан в классе Arrays
        System.out.println(array3==array2);//true
    }
}
