package HomeWork.Methods;

import java.util.Scanner;

public class Ex_7 {
    /*
    Напишите метод, который получает в качестве параметра целое число
большее или равное 10. Метод возвращает число без его крайней левой
цифры.
Использование методов в программах на языке Java 133
Например, для параметра 1234 метод вернет 234, а для параметра
104 -4.
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int i = newNum(num);
        System.out.println(i);
    }

    public static int newNum(int num) {
        int numDigits = String.valueOf(num).length();

        String s  = String.valueOf(1);

        for (int i = 1; i < numDigits; i++){
        s = s.concat("0");}
        int devider = Integer.parseInt(String.valueOf(s));

        int newNum = num %  devider;
        return newNum;
    }
}
