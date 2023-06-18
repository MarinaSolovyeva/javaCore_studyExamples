package StudyExample.Methods;

public class Employee2
/* Создайте класс Homework.Methods.Employee с атрибутами id , surname , age , salary , department ,
которые должны задаваться в конструкторе . В данном классе также создайте метод увеличения зар платы вдвое .
Создайте второй класс Homework.Methods.EmployeeTest , в котором создайте 2 объекта класса Homework.Methods.Employee .
Увеличьте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение новой зар олаты .*/ {


    Employee2(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int id;
    String surname;
    int age;
    int salary;
    String department;

    void salaryIncrease() { salary = salary * 2;}
}



    class Employee2Test {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(12, "Denis", 33, 400000, "Dev");

        Employee2 emp2 = new Employee2(13, "Marina", 27, 300000, "Dev");

        System.out.println(emp1.salary);
        System.out.println(emp2.salary);

        emp1.salaryIncrease();
        emp1.salaryIncrease();
        emp2.salaryIncrease();

        System.out.println(emp1.salary);
        System.out.println(emp2.salary);

    }
}


