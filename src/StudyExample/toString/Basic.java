package StudyExample.toString;

public class Basic {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("back", "V8");

        System.out.println(c3.toString());// аутпут : StudyExample.toString.Car@65ab7765

    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }


public String toString () {
    return "Mashina cveta "+ color + " i s motorom " + engine;
}} // здесь мы перезаписали метод тустринг! через c3.toString выдаст нам не путь ,а то что напишу в ретерне