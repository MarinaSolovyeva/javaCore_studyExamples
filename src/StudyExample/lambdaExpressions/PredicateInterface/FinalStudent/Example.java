package StudyExample.lambdaExpressions.PredicateInterface.FinalStudent;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example { }

class Student {
    String name; char sex; int age; int course; double avgGrade;

    Student (String name, char sex, int age, int course, double avgGrade) {
        this.name = name; this.sex = sex; this.age = age; this.course = course; this.avgGrade = avgGrade;}}

class StudentInfo {
    void printStudent (Student st) {
        System.out.println("Name :"+ st.name + ", sex :"+ st.sex+ ", Age "+ st.age+", Course "
                + st.course + ",Average grade "+ st.avgGrade);}

    void testStudents (ArrayList<Student> aL, Predicate <Student> t) {
        for (Student s : aL) {
            if (t.test(s)) {printStudent(s);}}}

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Alex", 'm', 26, 2, 6);
        Student st2 = new Student("Phil", 'm', 35, 4, 9);
        Student st3 = new Student("Nina", 'f', 21, 1, 8.1);
        Student st4 = new Student("Den", 'm', 30, 3, 8);
        Student st5 = new Student("Marina", 'f', 27, 4, 9);

        list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);

        StudentInfo si = new StudentInfo();

//        list.removeIf(student->student.name.endsWith("a"));
//        for (Student s: list) {
//            System.out.println(s.name);
//        }
//        System.out.println("______________________________"); вот так можно удалить элементы

            Predicate <Student> p1 = student -> student.avgGrade > 7.5;
            Predicate <Student> p2 = student -> student.sex == 'm';
            //допустим я хочу объединить эти две фильтрации

        si.testStudents(list,p1.and(p2)); // вот так можно объединить две проверки

        System.out.println("______________________________");

        si.testStudents(list,p1.or(p2)); // метод or- выведи все студентов которые
        // проходят хотя бы по одной из этих фильтрация

        System.out.println("______________________________");

        si.testStudents(list,p1.negate()); // этот метод будет отрицать принципы проверки p1





}}

// интерфейс, который содержит только 1 метод - называется функциональным интерфейсом
//Лямбда выражение будет срабатывать только в том случае, если интерфейс содержит только 1 метод


// если бы не лямбда выражение, пришлось бы создавать отдельные классы под кажд фильтр,
// имплементирующие данный интефейс, и перезаписывать метод boolean из интерфейса

