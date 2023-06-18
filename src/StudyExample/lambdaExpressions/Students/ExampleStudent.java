package StudyExample.lambdaExpressions.Students;

import java.util.ArrayList;

public class ExampleStudent {
}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student (String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent (Student st) {
        System.out.println("Name :"+ st.name + ", sex :"+ st.sex+ ", Age "+ st.age+", Course "
                + st.course + ",Average grade "+ st.avgGrade);
    }

    void testStudents (ArrayList <Student> aL, StudentChecks sc) { // StudentChecks sc - объект любого класса,
        // который имплементирует данный интерфейс
        for (Student s : aL) {
            if (sc.test (s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Alex", 'm', 26, 2, 6);
        Student st2 = new Student("Phil", 'm', 35, 4, 7);
        Student st3 = new Student("Nina", 'f', 21, 1, 8.1);
        Student st4 = new Student("Den", 'm', 30, 3, 8);
        Student st5 = new Student("Marina", 'f', 27, 4, 9);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();

        si.testStudents (list, (Student st) -> {return st.avgGrade > 7;});
        // самый короткий вариант написания
        //si.testStudents (list, st -> st.avgGrade > 7);
        System.out.println("__________________________________________");
        si.testStudents (list, (Student st) -> {return st.course < 3;});
        System.out.println("__________________________________________");
        si.testStudents (list, (Student st) -> {return st.avgGrade < 8.5;});
        System.out.println("__________________________________________");
        si.testStudents (list, (Student st) -> {return st.sex == st.sex;});
        System.out.println("__________________________________________");

    }

 }

interface StudentChecks {
    boolean test (Student s);
}// интерфейс, который содержит только 1 метод - называется функциональным интерфейсом
//Лямбда выражение будет срабатывать только в том случае, если интерфейс содержит только 1 метод


// если бы не лямбда выражение, пришлось бы создавать отдельные классы под кажд фильтр,
// имплементирующие данный интефейс, и перезаписывать метод boolean из интерфейса
