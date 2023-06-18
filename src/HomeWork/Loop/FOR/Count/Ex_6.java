package HomeWork.Loop.FOR.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_6 {
    /*
    С клавиатуры вводим количество учеников. потом для каждого ученика вводим оценку за работу.
    Если больше половины учеников получитили неудовлетворительно - контрольная провалена
     */
    public static Scanner sc = new Scanner(System.in);
    public static int numStudents = sc.nextInt();
    public static int count;

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            int grade = sc.nextInt();
            list.add(grade);
            if (grade <= 3) {
                count++;}}
        System.out.println(list);
        System.out.println(count > numStudents/2 ? "Контрольная провалена" : "Контрольная написана успешно");
    }
}