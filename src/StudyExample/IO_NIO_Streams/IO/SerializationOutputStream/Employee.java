package StudyExample.IO_NIO_Streams.IO.SerializationOutputStream;

import java.io.Serializable;

public class Employee implements Serializable { //Чтобы объект класса можно было сериализировать,
    // он должен имплементировать интерфейс serializable
    static final long serialVersionUID = 2; // не полагаемся на автоматическую нумерацию версию, создаем ее сами
    String name;
    String department;
    int age;
    transient double salary;//ключевое слово транзиент позволяет исключить данное поле из сериализации
    //после сериализации увижу "salary 0.0 - дефолтное значение double

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
