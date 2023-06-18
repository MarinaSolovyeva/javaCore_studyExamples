package StudyExample.Methods.GetSetIs;

public class Person {
    final String male;

    Person(String male) {
        this.male = male;
    }

    // делаем инкапсуляцию и добавляем модификатор private,
// если мы хотим что -то делать с нашими переменными вне класса, надо создавать public методы
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }

    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int w) {
        if (w > 0) {
            weight = w;
        }
    }
// если установить person возраст и вес, не соответств условиям, то значение просто не поменяется
    private boolean clever;
    public boolean isClever () {
        return clever;
    }// если булевая переменная, используем isClever


}
    class Test {
        public static void main(String[] args) {
            Person c = new Person("male");
            c.setName("Kolya");
            c.setAge(50);
            c.setWeight(15);
            System.out.println(c.getName());
            System.out.println(c.getAge());
            System.out.println(c.getWeight());
        }
    }

