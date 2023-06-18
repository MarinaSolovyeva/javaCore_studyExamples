package StudyExample.Collection_Interface.SET.Interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetex2 {
    public static void main(String[] args) {
    TreeSet <Student> treeSet = new TreeSet<>();
    Student st1 = new Student("Marina", 5);
    Student st2 = new Student("Denis", 3);
    Student st3 = new Student("Anya", 1);
    Student st4 = new Student("Larisa", 4);
    Student st5 = new Student("Julia", 2);
    Student st6 = new Student("Kristina", 3);

    treeSet.add(st1);
    treeSet.add(st2);
    treeSet.add(st3);
    treeSet.add(st4);
    treeSet.add(st5);


        System.out.println(treeSet);
        System.out.println(treeSet.first());//anya
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st6)); //выводит студентов на курсе ниже чем Кристина, Кристины в трисэте нет
        System.out.println(treeSet.tailSet(st6)); //выводит студентов на курсе выше или на том же самом чем Кристина, Кристины в трисэте нет

        //subSet- получает множество, элементы которых в диапазоне каких то двух показателей
        System.out.println(treeSet.subSet(st2, st1));// между третьим и пятым курсом [Student{name='Denis', course=3}, Student{name='Larisa', course=4}]

    }}

class Student implements Comparable <Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course- otherStudent.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course); // тк сравнение у нас идет по курсу, то equals и hashcode должен содержать только курс,имя убираю
    }
}
