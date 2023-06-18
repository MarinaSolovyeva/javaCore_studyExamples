package StudyExample.VariableArguments;

public class Basic {

    static void summa(int ... a) {//в листе параметров метода может быть только один вараргс
        // вараргс должен быть всегда на последнем месте. если же не получается, то действуем через массив
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println((summa));
    }

    public static void main(String[] args) {
        summa(6, 3, 1869);
    }
}
