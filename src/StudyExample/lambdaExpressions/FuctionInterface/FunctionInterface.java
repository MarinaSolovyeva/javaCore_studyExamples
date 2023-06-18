package StudyExample.lambdaExpressions.FuctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface {
}

class StudentF {
    String name; char sex; int age; int course; double avgGrade;

    StudentF (String name, char sex, int age, int course, double avgGrade) {
        this.name = name; this.sex = sex; this.age = age; this.course = course; this.avgGrade = avgGrade;}}

class StudentInfoF {
    void printStudent (StudentF st) {
        System.out.println("Name :"+ st.name + ", sex :"+ st.sex+ ", Age "+ st.age+", Course "
                + st.course + ",Average grade "+ st.avgGrade);}

    void testStudents (ArrayList<StudentF> aL, Predicate <StudentF> t) {
        for (StudentF s : aL) {
            if (t.test(s)) {printStudent(s);}}}

    public static void main(String[] args) {
        ArrayList <StudentF> list = new ArrayList<>();
        StudentF st1 = new StudentF("Alex", 'm', 26, 2, 6);
        StudentF st2 = new StudentF("Phil", 'm', 35, 4, 5);
        StudentF st3 = new StudentF("Nina", 'f', 21, 1, 7);
        StudentF st4 = new StudentF("Den", 'm', 30, 3, 8);
        StudentF st5 = new StudentF("Marina", 'f', 27, 4, 9);

        list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);

        StudentInfoF si = new StudentInfoF();

       // Function <StudentF, Double> f = student -> student.avgGrade; //function interface
        double res = avgofSmth(list, stud ->stud.avgGrade);
        System.out.println(res);

    }


    private static double avgofSmth (List<StudentF> list, Function <StudentF, Double> f) {
        double result = 0;
        for (StudentF st : list) {
            result += f.apply(st);
        }
        result =result / list.size();
        return result;
    }
}


