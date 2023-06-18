package StudyExample.lambdaExpressions.PredicateInterface.FinalStudent;

import java.util.ArrayList;

public class PredicateRemoveIf {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Morning");
        al.add("Evening");
        al.add("Night");

        al.removeIf(element -> element.length() < 5);
        System.out.println(al);
    }
}
