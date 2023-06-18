package StudyExample.Methods;

public class Student3
/*В классе StudentTest Написать два метода, которые принимают 2 input параметра лва объекта класса student.
первый методс равнивает двух студентов используя 1 if
и логические  операторы внутри него и выводит на экран информацию о том, равны ли студенты.

второй метод использует nested if statement, сравнивает все атрибуты стундента по отдельности и выводит на экран информацию
о том, равны ли студенты, а если не равны, то в чем именно было обнаружено первое неравенство

 */
{
    public String name;
    public int course;
    public double grade;

    public Student3 (String name,int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap (Student3 s1, Student3 s2) {
        Student3 s3 = s1;
        s1=s2;
        s2=s3;
        System.out.println(s1.name);
    }

    public static void changeName (Student3 s1) {
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student3 st1 = new Student3("Ivan", 3, 9.5);
        Student3 st2 = new Student3("Petr", 2, 5.00);
        Student3 st3 = new Student3("Roman", 4, 3.6);
    }
}

class StudentTest3 {
    public static void method1 (Student3 st1, Student3 st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }
    public static void method2 (Student3 st1, Student3 st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курсы, и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов, курсы, оценки отличаются");
                }
            } else {
                System.out.println("Имена студентов одинаковые, курсы и оценки отличаются");
            }
        } else {
            System.out.println("Имена студентов различаются");
        }
    }
}
