package StudyExample.Array;

public class Basic {
    public static void main(String[] args) {
        //=============================== этап Declaration - объявление==========================================

        int[] array1;// на этом этапе по умолчанию элементы принимают дефолтное значение инта, то есть 8 ячеек со значением 0
        String[] array2;// а здесь null
        double[][] array3;
        int[][] array10;
        double[] array5;
        double[] array7;
        int [] array , a; //и array и a - массивы


        //=============================== этап Allocation - размещение в памяти=================================

        array1 = new int[8];
        array2 = new String[3];//это длина, а не кол-во элементов
        array3 = new double[4][2];//  в 4 массивах будет по 2 элемента
        array10 = new int[3][]; // можно сделать так, но не наоборот
        array5 = new double[2];
        array7 = new double[2];

        System.out.println(array2.length);// 3-это переменная, элемент класса, не метод! круглые скобки здесь не нужны

        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "ok";

        System.out.println(array2[0]); // Privet - Вывожу на экран конкретное значение

        System.out.println(array2); //[Ljava.lang.String;@e9e54c2

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
            System.out.println(" ");

        }

        array3[0][0] = 3.14;// не обязаны инициализировать всее переменные
        array3[2][1] = 3.14;

        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;// здесь java проверяет - их длины одинаковы? да, везде 2
        array7 = array5;

        System.out.println(array3[1][0]);


    }

}
