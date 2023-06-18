package StudyExample.LOOP.Switch;

public class Basic {
    int grade;

    Basic(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Basic S1 = new Basic(3);

        switch (S1.grade) {
            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не найдена");
        }
    }
}

