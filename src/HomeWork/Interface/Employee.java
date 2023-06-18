package HomeWork.Interface;

import java.sql.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    Employee(String name, int salary, DEPARTMENT dep) {
        this.name = name;
        this.salary = salary;
        this.department = dep;}

    String name;
    int salary;
    DEPARTMENT department;

    // String department;}
    public enum DEPARTMENT {ACC, Dev, IT, Management, Administration} ;
}
    class TestEmployee {
        void printEmployee(Employee e) {
            System.out.println("Имя работника :" + e.name + ", " +
                    "Зарплата :" + e.salary + ", Отдел :" + e.department);}

        void filtrEmployee(ArrayList<Employee> ar, Predicate<Employee> p) {
            for (Employee e : ar) {
                if (p.test(e)) {
                    printEmployee(e);}}}

        public static void main(String[] args) {
            ArrayList<Employee> ar = new ArrayList<>();
            Employee emp1 = new Employee("Ivan", 350000, Employee.DEPARTMENT.Dev);
            Employee emp2 = new Employee("Kate", 100000, Employee.DEPARTMENT.ACC);
            Employee emp3 = new Employee("Petr", 80000, Employee.DEPARTMENT.IT);
            Employee emp4 = new Employee("Alex", 120000, Employee.DEPARTMENT.IT);
            Employee emp5 = new Employee("Julia", 30000, Employee.DEPARTMENT.Administration);
            Employee emp6 = new Employee("Jane", 50000, Employee.DEPARTMENT.Management);
            Employee emp7 = new Employee("Karina", 35000, Employee.DEPARTMENT.Administration);
            ar.add(emp1);
            ar.add(emp2);
            ar.add(emp3);
            ar.add(emp4);
            ar.add(emp5);
            ar.add(emp6);
            ar.add(emp7);

            TestEmployee te = new TestEmployee();

            te.filtrEmployee(ar, (Employee e) -> {return e.salary < 100000;});
            System.out.println("______________________________________________");

            te.filtrEmployee(ar, (Employee e) -> {return e.department == Employee.DEPARTMENT.IT;});
            System.out.println("______________________________________________");
            }}