package HomeWork.Scanner.NumbersScanner;

import javax.swing.*;
import java.util.Scanner;

public class Ex_10 {
    /* счастливый билет если сумма первых трех его цифр равна сумме
    последних трех его цифр и обе эти суммы являются четными.*/

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sum1;
        int sum2;
        int num = in.nextInt();
        char[] chars = String.valueOf(num).toCharArray();
            sum1 = chars[0] + chars[1] + chars[2];
            sum2 = chars[3] + chars[4] + chars[5];
        if (sum1 == sum2 && sum1 %2==0) {
            System.out.println("Ваш билет счастливый");}
        else System.out.println("Ваш билет не счастливый");
}}

