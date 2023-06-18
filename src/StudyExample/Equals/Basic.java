package StudyExample.Equals;
import java.util.ArrayList;
public class Basic {
    /* public boolean equals (Object obj) {
    return (this == obj); */
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("back", "V8");

    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    /* нельзя написать сразу так
    public boolean equal (Car c) {
    return (color.equals(c.color) && engine.equals(c.engine));

потому что нам нужно заоверрадить метод equals из класса обджект, а первое правило:
параментры в методы должны быть одинаковые. если написать в параментре не obj, overriding не произойдет    */
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c20 = (Car) obj; // проводим кастинг кара
            return (color.equals(c20.color) && engine.equals(c20.engine));
        } else {
            return false;
        }
    }
}