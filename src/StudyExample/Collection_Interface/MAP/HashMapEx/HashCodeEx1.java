package StudyExample.Collection_Interface.MAP.HashMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Studenthash, Double> map = new HashMap<>();
        Studenthash s1 = new Studenthash("Masha", "Petrova", 2 );
        Studenthash s2 = new Studenthash("Misha", "Ivanoc", 1 );
        Studenthash s3 = new Studenthash("Pasha", "Logan", 4 );
        Studenthash s4 = new Studenthash("Sasha", "Durov", 5 );
        map.put(s1, 7.5);
        map.put(s2, 5.4);
        map.put(s3, 8.9);
        map.put(s4, 9.0);
        System.out.println(map);//{Student{name='Misha', surname='Ivanoc', course=1}=5.4,
        // Student{name='Sasha', surname='Durov', course=5}=9.0,
        // Student{name='Pasha', surname='Logan', course=4}=8.9,
        // Student{name='Masha', surname='Petrova', course=2}=7.5}

        Studenthash s5 = new Studenthash("Masha", "Petrova", 2 );
        boolean result = map.containsKey(s5);

        System.out.println(result);// true

        System.out.println(s1.hashCode()); //-1226056046
        System.out.println(s2.hashCode());//-2021673470
        // в любом случае разные хэшкоды

        System.out.println(s1.hashCode()); //-1226056046
        System.out.println(s2.hashCode());//-2021673470

//        System.out.println(result); //false
//        System.out.println(s1.equals(s5)); // true
//        //если не перезаписать метод hashcode - то иквулс будет тру, а коллекция будет думать , что это разные объекты
//    }
}}

class Studenthash {
    String name;
    String surname;
    int course;

    public Studenthash(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studenthash student = (Studenthash) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}