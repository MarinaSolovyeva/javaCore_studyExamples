package HomeWork;

import java.util.Objects;

public class Car {
    /*Создайте класс с тремя переменными: цвет, мотор, количество дверей.
    СОздать второй класс, в котором будут 2 метода: один изменяет кол-во дврей объекта класса кар на количество, прописанное в параментре метода,
    2-й принимает в параметры два объекта класса кар и меняет их цвета местами.
    примените оба метода в мэйн и выведите на экран атрибуты всех объектов

     */
    String color;
    String engine;
    int door;

    public Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;

    }
}

class CarTest {
    void changeDoor(Car q, int door) {
        q.door = door;
    }

    void changecolor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V6", 4);
        Car car2 = new Car("black", "V8", 2);
        ct.changeDoor(car1, 3);
        ct.changecolor(car1, car2);

        System.out.println("Информация о первой машине : Цвет: "
                + car1.color + " Мотор: " + car1.engine + " Количество дверей " + car1.door);
        System.out.println("Информация о первой машине : Цвет: "
                + car2.color + " Мотор: " + car2.engine + " Количество дверей " + car2.door);
    }

}




