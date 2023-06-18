package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;

public class MethodFlatMap {
    public static void main(String[] args) {
        Students st1 = new Students("Petya", "Vasin", 4, 26);
        Students st2 = new Students("Kostya", "Urov", 2, 19);
        Students st3 = new Students("Kolya", "Durov", 1, 17);
        Students st4 = new Students("Misha", "Lonin", 5, 28);
        Students st5 = new Students("Masha", "Leonova", 1, 19);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty (st1);
        f1.addStudentToFaculty (st2);
        f1.addStudentToFaculty (st3);
        f2.addStudentToFaculty (st4);
        f2.addStudentToFaculty (st5);

        List <Faculty> facultyList = new ArrayList<>();
        facultyList.add (f1);
        facultyList.add (f2);

        /*
        Итого у нас есть лист факультетов, который содержит факультеты, а сами факультеты содержат листы
        своих студентов. метод flatMap используем тогда, когда нужно поработать не с самими элементами,
        а с элементами элементов наших коллекций
        например сейчас хотим вывести имена всех студентов из наших факультетов

        то есть сначала у нас есть факультеты,с помощью факультета получаю лист студентов на этом факультеты,
        потом вызываю стрим, а потом с помощью форич вывожу все на экран

        с помощью метода FlatMap и метода Stream на кажд элементе листа факультетов, мы для кажд нашей коллекции создаем стрим, а они
        создают один большой стрим

        мы взяли первый факультет, нашли лист сотрудников, с помозь. листа получаем поток, с помощью потока выводим на экран
        потом берем второй факультет -..-

        является intermediate методом


         */

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).
                forEach(e -> System.out.println(e.getName()));


    }
}


class Faculty{
    String name;
    List<Students> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
    }

    public List<Students> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty (Students st) {
        studentsOnFaculty.add(st);
    }
}