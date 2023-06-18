package HomeWork;

import java.lang.*;

public class HomeStringBuilder {
    //создайте класс, в котором будет метод равенство. инпут параментрами данного метода - 2 объекта StringBuilder.
    // Метод имеет return type boolean, возвращает тру , если знач объектов совпадают, false , если нет.
    public static boolean raven (StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
class Test {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder ("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");

        System.out.println(HomeStringBuilder.raven(sb3, sb4));
    }

}