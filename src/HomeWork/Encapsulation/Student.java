package HomeWork.Encapsulation;

public class Student {

    Student (String name1, int course, int grade) {
        StringBuilder sb1 = new StringBuilder(name1);
        setName(sb1);
        setCourse(course);
        setGrade(grade);
    }

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {this.name = name;}}

    public StringBuilder getName() {
     return name;}

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {this.course = course;}}

    public int getCourse()
        {return course;}

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {this.grade = grade;}}

    public int getGrade() {return grade;}

    public void showInfo() {
        System.out.println("Имя студента :" + getName()+ ", Курс :"+getCourse()+ ", Оценка студента :" + getGrade());
    }
}
class TestStudent {
    public static void main(String[] args) {
        Student t1 = new Student("Denis", 3, 9);
        Student t2 = new Student("Ma", 4, 10);
        t1.showInfo();
        System.out.println(" ");
        t2.showInfo();

    }
}
