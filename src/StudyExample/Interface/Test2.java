package StudyExample.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();
        Employees em1 = new Employees(134, "Vasya", "Petrov", 65000);
        Employees em2 = new Employees(135, "Petya", "Kotov", 50000);
        Employees em3 = new Employees(158, "Masha", "Leonov", 35000);
        Employees em4 = new Employees(100, "Vasya", "Sokolov", 100000);
        list.add(em1);
        list.add(em2);
        list.add(em3);
        list.add(em4);
        System.out.println("Without sort");
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println("After sort");
        System.out.println(list);

    }
}

class Employees {
    int id;
    String name;
    String surname;
    int salary;

    public Employees(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int compareTo(Employees anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else return 1;
    }


    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", name = " + name +
                ", surname = " + surname +
                ", salary = " + salary;
    }
}

class NameComparator implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.salary - o2.salary;
    }
}
