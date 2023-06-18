package HomeWork.Methods;

public class Ex_1 {
    /*
    Напишите метод, который принимает в качестве параметра число и
возвращает:
• -1 - в случае если число отрицательное;
• О - в случае если число равно О;
• 1 - в случае если число положительное.
     */
    static int i = 0;

    public static int num(int num) {

        if (num < 0) {
            i = -1;}
        if (num == 0) {
            i = 0;}
        else {
            i =  1;}
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        num(15);
    }
}
