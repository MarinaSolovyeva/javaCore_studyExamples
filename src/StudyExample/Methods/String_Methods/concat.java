package StudyExample.Methods.String_Methods;

public class concat {
    public static void main(String[] args) {
        //s5+s6 , тоже самое
        String s1 = new String("privet");
        String s5 = "privet,";
        String s6 = "drug";

        System.out.println(s5.concat(s6));
    }
}

class concat2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";
        // если не хотим чтобы а складывалось с b
        // а если даже в этом случае поставить скобки в а и b - тогда сложение все же произойдет
        System.out.println("" + a + b + s);
    }
}

class concat3 {
    public static void main(String[] args) {
        int c = 5;
        String s1 = "hello";
        // String s2 = c + 8;// тк стринг , несоответствующие типы, ошибка компиляции
        //System.out.println(s2);
    }
}
//======================================================================================================================

class concat4 {
    double salary;
    boolean isManager;

    concat4(double salary, boolean Manager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class tempConcat4 {
    public static void main(String[] args) {
        concat4 emp = new concat4(100.5, true);
        System.out.println("is he manager? " + emp.isManager + " his salary is " + emp.salary);
    }
}


