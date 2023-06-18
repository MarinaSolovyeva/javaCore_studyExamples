package StudyExample.lambdaExpressions;

public class Basic {
    static void def (Test t) {
        System.out.println(t.abc ("Hello"));
    }

    public static void main(String[] args) {
        def (x->x.length()); // 5
    }
}

interface Test {
    int abc (String s);
}
