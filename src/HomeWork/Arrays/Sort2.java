package HomeWork.Arrays;

public class Sort2 {
    // класс с методом showArray. инпут - двумерный массив типа String.
    // элементы должны выводиться в след порядке {{эл 00, 01} {10 11}{20 21 22}

    static String [][] arrayWeather = {{"January", "April", "June", "September"},{"Winter", "Spring", "Summer", "Autumn"},
            {"Cold", "Warm", "Hot", "Windy"} };

    public static void showArray (String [] [] array) {


        for (String [] array2:array) {
            for (String a : array2) {
                System.out.print(a + " ");
            }
        }
    }
    public static void main(String[] args) {

        System.out.print(arrayWeather[0][0]);
        System.out.print(arrayWeather[0][1]);
        System.out.print(arrayWeather[2][0]);
        System.out.print(arrayWeather[2][1]);
        showArray(arrayWeather);
    }
}
