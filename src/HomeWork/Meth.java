package HomeWork;

public class Meth {
    /* Создайте класс , в котором будут 5 overloaded методов , которые вычисляют сумму нуля , одного ,
    двух , трёх и четырёх целых чисел соответственно , передают эту сумму в output и выводят еë на экран .
    В случае , когда слагаемые отсутствуют ( т.е. когда параметров нет ) сумма пусть равняется О.
     */
    int summa (int a) {return a;}
    int summa (int a,int b) {return a+b;}
    int summa (int a,int b,int c) {return a+b+c;}
    int summa (int a,int b,int c, int d) {return a+b+c+d;}
    int summa () {return 0;}
        public static void main(String[] args) {
        Meth Methsumm = new Meth();
        System.out.println(Methsumm.summa(4,8));

    /* static void summa(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println((summa));
    }

    public static void main(String[] args) {
        summa(7, 18, 52, 4); */
    }
}

