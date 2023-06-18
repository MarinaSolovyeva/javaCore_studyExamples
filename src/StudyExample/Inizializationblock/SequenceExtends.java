package StudyExample.Inizializationblock;

public class SequenceExtends {
    public static void main(String[] args) {
       Lion li = new Lion();

       /*
       Сначала будут вызываться все статик инициалайзеры: пэрентов класса и чайл.
       потом non static инициализаторы + их конструкторы
        */
    }
}
class Animal {
    Animal() {System.out.println("Constrictor of animal");}  //5
    static {System.out.println("Static init in animal");} //1
    {System.out.println("non-static init of animal");} //4
}
    class Mammal extends Animal {
        Mammal() {System.out.println("Constrictor of Mammal");} //7
        static {System.out.println("Static init in Mammal");} //2
        {System.out.println("non-static init of Mammal");}  //6
    }

    class Lion extends Mammal {
        Lion() {System.out.println("Constrictor of Lion");} //9
        static {System.out.println("Static init in Lion");} //3
        {System.out.println("non-static init of Lion");} //8
    }
