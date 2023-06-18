package StudyExample.Methods;

public class Student2
/*Измените класс Student так , чтобы он имел 1 общий конструктор
создаем три объекта с разным количеством имеющихся параментров

 */ {
    Student2(int idNumber, String name, String surname, int year, double pointEconomy, double pointMath, double pointLanguage) {
        this.idNumber = idNumber;
        this.name = name;
        this.year = year;
        this.pointEconomy = pointEconomy;
        this.pointMath = pointMath;
        this.pointLanguage = pointLanguage;
        this.surname = surname;
    }


    int idNumber;
    String name;
    String surname;
    int year;
    double pointEconomy;
    double pointMath;
    double pointLanguage;

}

class StudentTest2 {
    public static void main(String[] args) {

        Student2 Student_1 = new Student2(1, "Phil", "Petrov", 2021, 4.6, 5, 4.1);
        Student2 Student_2 = new Student2(2, "Max", "Ivanov", 0,0,0,0);
        Student2 Student_3 = new Student2(0,null,null,0,0,0,0);


        System.out.println(Student_1.name +" "+ Student_2.surname+" "+Student_3.surname);
    }
}
