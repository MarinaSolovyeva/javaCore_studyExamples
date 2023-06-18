package HomeWork.Loop;

import java.nio.charset.StandardCharsets;

public class Ex_8 {
    /*
    Напишите класс, который выводит на экран (в строку с пробелами) все
трехзначные целые положительные числа, соответствующие следующему требованию:
две последних цифры (десятков и единиц) образуют
двузначное число, которое без остатка делит первое число (сотни).
     */

    public static void main(String[] args) {
        for (int i = 300; i < 400; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            int i1 = chars[0] - '0';
            int i23 = Integer.parseInt(Integer.toString(chars[1] - '0') + Integer.toString(chars[2] - '0'));
            if (i23 % i1 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

