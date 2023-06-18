package StudyExample.StringBuilder;
class Car {}
public class Basic {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);//без определенного значения,но его capacity- 50 значений
        StringBuilder sb4 = new StringBuilder(sb3);// ссылается на объект с таким же значением , как у sb3


        System.out.println(sb2.length()); // 11. если значения нет, как у sb3 - length 0. не путать capacity и length

        System.out.println(sb2.charAt(3)); // d. с параметром int

        System.out.println(sb2.indexOf("o")); // 1. параметр только String
        System.out.println(sb2.indexOf("o", 2)); // 2. параметр только String

        String s = sb2.substring(5); // day!!!. отрывок
        System.out.println(s); //day
        String s2 = sb2.substring(5, 8);
        System.out.println(s2); //day

        System.out.println(sb2.subSequence(5, 8)); //day. как substring, только в output у него char
        /*=======================================================================================
        sb2.append(22);
        System.out.println(sb2); // добавляет в конец значение, принимает любые примитивные типы, объекты.
                                // важно : он не создает новый объект, он меняет существующий
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append(new Car()); // на выходе вижу StudyExample.StringBuilder.Car@65ab7765
        System.out.println(sb2);
        ========================================================================================*/

        System.out.println(sb2.insert(4, "55"));// Good55 day!!!. вставляет на определенную позицию нужное значение
        System.out.println(sb2.insert(sb2.length(), "Hello")); // Good55 day!!!Hello . вставляем что-то в конец - чтобы не считать символы, можем воспользоваться методом length;

        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6);
        System.out.println(sb10); //HelWorld

        StringBuilder sb11 = new StringBuilder("Hello World");// удаляет символ
        sb11.deleteCharAt(6);
        System.out.println(sb11); //Hello orld

        sb11.reverse(); // переворачивает StringBuilder в обратную сторону, параметров не принимает
        System.out.println(sb11); // dlro olleH. главное не забывать что стринг не имеет метода реверс и
        // если захотим сделать сабстринг стрингбилдера, не получится потому что это стринг

        StringBuilder sb13 = new StringBuilder("Vsem Privet");
        sb13.replace(0, 5, "Pete");
        System.out.println(sb13);//PetePrivet. отличается от replace String, имеет три параметра,меняет отрезок на определенный стринг

        System.out.println(sb13.capacity()); // 27. количество мест в нашем массиве
        System.out.println(sb1.capacity()); //16



    }
}
