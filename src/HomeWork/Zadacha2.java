package HomeWork;

public class Zadacha2
/*2. В первом классе создайте static final переменную Пи = 3,14 . Используйте Данную константу в non - static методе ,
который принимает в параметре значение радиуса и вычисляет площадь круга по формуле : Площадь = Пи радиус * радиус .
Также используйте данную константу в static методе , который принимает в параметре значение радиуса и вычисляет длину
окружности по формуле : Площадь = 2 * Пи * радиус . Создайте ещё один non - static метод , который принимает в
параметре значение радиуса и выводит на экран информацию о радиусе , площади круга и длине окружности .
Используйте все 3 метода во 2 - м классе .*/ {
    public final static double PI = 3.14;

    public double ploshadkruga (double radius)
    {
        double sl = PI * radius * radius;
        return sl;
    }

    public static double lengthr(double radius2) {
        double d1 = 2 * PI * radius2;
        return d1;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга " + ploshadkruga(radius3));
        System.out.println("Длина окружности " + lengthr(radius3));
    }
}

class Zadacha2Test {
    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        z.ploshadkruga(5);
        Zadacha2.lengthr(7.5);
        z.info(3);

    }
}
