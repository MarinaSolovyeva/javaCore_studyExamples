package HomeWork.Interface;

import HomeWork.Inheritance.Animal;

public abstract class AnimalI {
    String name;
    AnimalI(String name) {
        this.name = name;}
    abstract void eat();
    abstract void sleep();}
abstract class Fish extends AnimalI {
    Fish(String name) {
        super(name);
        this.name = name;}

    void sleep() {System.out.println("It is so interesting how fishes sleep");}
    abstract void swim();}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;}
        void swim () {System.out.println("Mechenosec is beautiful and swims very fast");}
        void eat () {System.out.println("Mechenosec doesn't eat other fish and eat just feed");}
    }

abstract class Bird extends AnimalI implements ISpeakable {
    Bird(String name) {
        super(name);
        this.name = name;}
    abstract void fly();
    public void speak() {System.out.println(name + " sings");}}

class Pingvin extends Bird {
    Pingvin (String name) {
        super (name);
        this.name = name;}
    void eat () {System.out.println("Pingvin loves fish");}
    void sleep () {System.out.println("Pingvin hugs when they sleep");}
    void fly () {System.out.println("Pingvin can not fly");}}

abstract class Mammal extends AnimalI implements ISpeakable {
    Mammal(String name) {
        super(name);
        this.name = name;}
    abstract void run();}

class Lion extends Mammal {
    Lion (String name) {super (name);
    this.name = name;}
    void eat () {System.out.println("Lion loves meal");}
    void sleep () {System.out.println("Lion sleeps a lot");}
    void run(){System.out.println("Lion is not the most fast cat");}}
interface ISpeakable {
    default void speak() {System.out.println("Somebody speaks");}
}

class Test {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Mechenosec");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();

        ISpeakable p = new Pingvin ("Pingvin");
        p.speak();

        AnimalI l = new Lion ("Lion");
        l.eat();
        l.sleep();

        Mammal l2 = new Lion ("Lion 2");
        l2.eat();
        l2.sleep();
        l2.run();
        l2.speak();

    }
}