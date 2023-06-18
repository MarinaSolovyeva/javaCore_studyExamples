package StudyExample.Collection_Interface.QUEUE.Interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2_Student {
    public static void main(String[] args) {
    PriorityQueue <Student> prq = new PriorityQueue<>();
        Student st1 = new Student("Marina", 5);
        Student st2 = new Student("Denis", 3);
        Student st3 = new Student("Anya", 1);
        Student st4 = new Student("Larisa", 4);
        Student st5 = new Student("Julia", 2);
        Student st6 = new Student("Kristina", 3);

        prq.add(st1);
        prq.add(st2);
        prq.add(st3);
        prq.add(st4);
        prq.add(st5);



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
