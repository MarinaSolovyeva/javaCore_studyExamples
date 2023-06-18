package StudyExample.Methods.ExampleHuman;

public class Human {

    public String name;
    public int salary;

    public Human(String n) {
        this.name = n;}

//    public void work() {
//        System.out.println("Rabotat'");
//    }
//
//    public static void rest() {
//        System.out.println("otdyhat'");
//    }
}
// если элемент private, он наследован быть не может

class Student extends Human {
    public Student(String n) {
        super(n);
    }

    public static void main(String[] args) {
        Human hDenis = new Human("Denis");
        Human hAlina = new School("Alina");
        Student sMarina = new Student("Marina");
        System.out.println(hDenis instanceof School);
//        School sAlina = (School)hDenis;


//
//        System.out.println(hDenis.name);
//        System.out.println(hAlina.name);
//        System.out.println(sMarina.name);
//        System.out.println(sAlina.name);


    }
}

class School extends Student{

    public School(String n) {
        super(n);
    }
}
