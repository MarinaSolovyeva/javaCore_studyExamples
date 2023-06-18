package StudyExample.Regex;

public class Ex2_1_PrintF {

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t  %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }
    //в первом параметре говорю, как надо выводить параметры
    //%03d - d - работа с цеыми числами, 3 - три символа для id,0 -если id 1 - перед единицей будет 2 нуля

    //%-12s -будем работать со стрингами выравн по левой стороне и выделяем 12 символов

    //,.1f - будем округл до 1 символа, ,- разделитель разрядов в числах
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Marina", "Solovyeva", 200000, 1.5);
        Employee emp2 = new Employee(1, "Denis", "Savateev", 500000, 2.0);

        employeeInfo(emp1);
//
//        String newString = String.format("%03d \\t  %-12s \\t %-12s \\t %,.1f \\n\"\n" +
//                emp1.id, emp1.name, emp1.surname, emp1.salary * (1 + emp1.bonusPct));
    }
}


class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}