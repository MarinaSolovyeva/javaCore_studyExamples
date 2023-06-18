package StudyExample.Methods.ExampleHuman1;

public class Human {
    private String name = "Kolya";
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}


class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
    }
}
