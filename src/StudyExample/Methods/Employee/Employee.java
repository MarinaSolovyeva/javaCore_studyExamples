
import java.sql.SQLOutput;
public class Employee {

    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat'");
    }

    class Doctor extends Employee {
        void lechit() {
            System.out.println("Lechit");
        }
    }

    class Teacher extends Employee {
        int koluch;
        void uchit() {
            System.out.println("Uchit");
        }
    }

    class Driver extends Employee {
        String nazvanieMachini;
        void vodit() {
            System.out.println("Vodit");
        }
    }

}
