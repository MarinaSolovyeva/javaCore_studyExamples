package HomeWork.Loop.FOR.Count;

public class Ex_5 {
    /*
    Вывести все двухзначные числа, где разница между первой и последней цифрой не привышает 3
    Нужно посчитать кол-во этих чисел
     */
    public static int count;

    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            if (((chars[0] - '0') - (chars[1] - '0')) <= 3 &&
                    ((chars[0] - '0') - (chars[1] - '0')) >= -3) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Количество чисел равно " + count);
    }
}
