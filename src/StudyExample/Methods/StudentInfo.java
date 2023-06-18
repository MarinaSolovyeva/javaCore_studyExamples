package StudyExample.Methods;

/* создать два класса , первый Student, он содержит номер билета, фио, год оучения,среднюю оценку по экономике,
по математике,   ин язу.
создать второй класс, стьюдент тест, где создать три объекта класса стьюдент ,
вывсти на экран среднюю оценку каждого студента по трем предметам

Измените класс StudentTest так , чтобы среднюю арифметическую оценку студента выводил на экран метод .
Т.е. создайте 1 метод , параметр которого - это объект класса Student ,
a в теле метода будет вычисляться средняя арифметическая оценка и выводиться на экран */

public class StudentInfo {
    StudentInfo(int idNumber, String name, int year, double pointEconomy, double pointMath, double pointLanguage) {
        this.idNumber = idNumber;
        this.name = name;
        this.year = year;
        this.pointEconomy = pointEconomy;
        this.pointMath = pointMath;
        this.pointLanguage = pointLanguage;
    }

    int idNumber;
    String name;
    int year;
    double pointEconomy;
    double pointMath;
    double pointLanguage;

    double accountAverage() {
        return (pointEconomy + pointMath + pointLanguage) / 3;
    }
}

class StudentTest {
    public static void main(String[] args) {

        StudentInfo Student_1 = new StudentInfo(1, "Phil", 2021, 4.6, 5, 4.1);
        StudentInfo Student_2 = new StudentInfo(2, "Max", 2021, 4.1, 3, 4.9);
        StudentInfo Student_3 = new StudentInfo(3, "Lee", 2021, 4.3, 4, 2.1);

        Object [] Students = new Object[100];

        System.out.println("Средний балл студента 1 = " + Student_1.accountAverage() + "\n" +
                "Средний балл студента 2 = " + Student_2.accountAverage() + "\n" +
                "Средний балл студента 3 = " + Student_3.accountAverage() + "\n");
    }
}


