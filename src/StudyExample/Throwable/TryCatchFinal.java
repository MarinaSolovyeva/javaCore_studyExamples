package StudyExample.Throwable;

public class TryCatchFinal  {

    public static void main(String[] args) {
        int [] array = {4,8,1};
        System.out.println("We have an array");

        try { //может быть только 1 трай
            System.out.println(array[5]);
            System.out.println("Have a nice day");
        }
        //Допустим я знаю что мой код может выбрасывать ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) { //мжет быть много catch
            System.out.println("You catch exception");
        }

        finally { //только 1 файнал
            System.out.println("finally"); // этот блок будет работать в любом случае
        }
        // к try могу написать либо catch либо finally, либо и то и то
// между блоками я не могу писать ничего другого

    }
}
