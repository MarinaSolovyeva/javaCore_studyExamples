package HomeWork;

public class Chas2 {
    /* Создать метод, который будет выводить на экран время в формате час: минута: секунда, в интервале от 0 до 6ч.
    если час больше единицы и минута кратна 10, закончить метод.
    если секунда умноженная на час больше минуты, пора переходить на другую минуты

    переписать задание так, чтобы outer и inner были while, а middle -do while*/


    static void time() {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                int sekunda = 0;

                INNER:
                while (sekunda < 60) {

                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + " : " + minuta + " : " + sekunda);
                    sekunda++;
                }
            } while (minuta < 59);
            chas++;
        }
    }




    public static void main(String[] args) {
        time();
    }
}


