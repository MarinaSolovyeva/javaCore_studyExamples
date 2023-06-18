package StudyExample.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodFilter {
    public static void main(String[] args) {


        Students st1 = new Students("Petya", "Vasin", 4, 26);
        Students st2 = new Students("Kostya", "Urov", 2, 19);
        Students st3 = new Students("Kolya", "Durov", 1, 17);
        Students st4 = new Students("Misha", "Lonin", 5, 28);

        List<Students> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

    /*    list.stream().filter(element
                -> element.getAge() >22);
    } фильтруем по каким то значениям
    филттр возвращает стрим, получили стрим, фильтр вернут стрим с теми студентами которые пройдут этот фильтр
    то есть те кто не проходят фильтр в новый поток не попадают. если хотим потом преобразовать потом снова влист
    - collect.и тогда будет выглядеть все так

    */

        list = list.stream().filter(element
                -> element.getAge() > 22).collect(Collectors.toList());
        System.out.println(list);


        //способ создания стрима
        //Stream<Students> myStream = Stream.of(st1,st2,st3,st4);



        list =list.stream().sorted((x,y)-> x.getName().compareTo(y.getName())).collect(Collectors.toList());

        System.out.println(list);
    }
}
class Students {
    private String name;
    private String surname;
    private int course;
    private int age;

    public Students(String name, String surname, int course, int age) {
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
