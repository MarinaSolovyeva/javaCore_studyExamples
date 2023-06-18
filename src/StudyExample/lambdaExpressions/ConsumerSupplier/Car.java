package StudyExample.lambdaExpressions.ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is " + model + ", color is " + color + ", engine is " + engine;
    }
}

class Test {

    //метод, который создает новые машины
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get()); // get- единственный абстрактный метод у Supplier
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);//  а уж что именно должен делать этот метод, я опишу при его использовании
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "Silver", 1.6));
        //createThreeCars(() - так как у метода get нет параметров, скобки остаются пустыми
        System.out.println("our cars :" + ourCars);

 /*       changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car " + car);
            можно написать этот код так */

        Consumer <Car> consumer = car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car " +car);
        };
        // то есть мы показываем здесь, как должен работать наш метод accept, принимающий Car

        consumer.accept(ourCars.get(0));//а здесь мы вызываем этот метод
        System.out.println("ourCars " + ourCars);
    }
}
