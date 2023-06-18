package HomeWork.Inheritance;

public abstract class Animal {
    Animal() {
        System.out.println("I am an animal");}
    static int eyes;

    static void eat() {System.out.println("Animal eats");}
    static void drink() {System.out.println("Animal drinks");}

    String word = "Privet";

}

class Pet extends Animal {
    Pet() {System.out.println("I am a pet");
        eyes = 2;}
    String name;
    static int tail = 1;
    static int pow = 4;
    static void run () {System.out.println("Pet runs");}
    static void jump () {System.out.println("Pet jumps");}
    static void eat() {System.out.println("Pet eats");}
}

class Dog extends Pet{
    Dog (String name) {
        this.name = name;
        System.out.println("I am a dog and my name is" + name);}
    static void play () {System.out.println("Dog plays");}
}

class Cat extends Pet {
    Cat (String name) {this.name = name;
        System.out.println("I am a cat and my name is" + name);}

    static void sleep () {System.out.println("Cat sleeps");}

    static void eat() {System.out.println("Cat eats");}
}

class Test {
    public static void main(String[] args) {
        System.out.println(Dog.pow);
        Cat.sleep();

    }}

