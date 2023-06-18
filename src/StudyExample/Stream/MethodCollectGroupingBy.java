package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodCollectGroupingBy {
    public static void main(String[] args) {


        StudentCollect st1 = new StudentCollect("petya", "Vasin", 4, 26);
        StudentCollect st2 = new StudentCollect("Kostya", "Urov", 2, 19);
        StudentCollect st3 = new StudentCollect("kolya", "Durov", 1, 17);
        StudentCollect st4 = new StudentCollect("Misha", "Lonin", 4, 28);
        StudentCollect st5 = new StudentCollect("masha", "Lonin", 1, 20);
        StudentCollect st6 = new StudentCollect("Lina", "Fedurova", 2, 22);

        List<StudentCollect> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

        Map<Integer, List <StudentCollect>> map = list.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;}).collect(Collectors.groupingBy(el ->el.getCourse()));
        /*увеличил имена на заглавн буквы и сгруппировать их по группам по курсам == у кажд курса получится свой лист
        collect в свою очередь возвращает здесь map который содержит integer как ключ, а как значение лсит студентов
        ключ -номер курса, значение - лист студентов , поэтому значение можно присвоить map
*/
        for (Map.Entry <Integer, List <StudentCollect>> entry:map.entrySet()) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue().toString());
        }

    }
}

class StudentCollect {
    private String name;
    private String surname;
    private int course;
    private int age;

    public StudentCollect(String name, String surname, int course, int age) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                '}';
    }
}