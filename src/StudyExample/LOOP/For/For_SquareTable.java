package StudyExample.LOOP.For;

public class For_SquareTable
//Пусть выдается таблица квадратов от 1 до 99
{
    public static void main(String[] args) {
        int i;
        int result;

        for (i = 1; i <= 99; i++)
        {
            result = i*i;

            if (i / 1 % 10 == 1)
            System.out.println("\n");
            System.out.print(result+"\t");
        }
    }
}

