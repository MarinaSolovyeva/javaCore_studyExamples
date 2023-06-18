package HomeWork;


public class Chas {
    /* Создать метод, который будет выводить на экран время в формате час: минута: секунда, в интервале от 0 до 6ч.
    если час больше единицы и минута кратна 10, закончить метод.
    если секунда умноженная на час больше минуты, пора переходить на другую минуты */

    static void time() {
        OUTER:
        for (int chas = 0; chas < 6; chas++) {
            MIDDLE:
            for (int minuta = 0; minuta < 60; minuta++) {
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sekunda = 0; sekunda < 60; sekunda++) {
                    if (sekunda * chas > minuta) {
                        continue INNER;
                    }
                    System.out.println(chas + " : " + minuta + " : " + sekunda);
                }

            }
        }
    }


    public static void main(String[] args) {
        time();
    }
}

