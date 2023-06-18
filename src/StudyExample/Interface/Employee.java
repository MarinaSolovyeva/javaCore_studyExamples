package StudyExample.Interface;

public class Employee {

        double salary = 100;
        String name = "Kolya";
        int age;
        int experience;
        void eat() {
        System.out.println("Kushat");
    }
        void sleep() {
        System.out.println("Spat'");
    }

        class Teacher extends Employee implements Help_able {
            int koluch;
            public void pomosh () {// не забываем дописывать паблик
                System.out.println("uchitel okazyvaet pomosh");
            } // Не забываем дописать public, ведь в интерфейсе он по умолчанию паблик,
            // а в классе имплементирующем его модифактор доступа не может быть уже
            public void tushitpojar() {
                System.out.println("uchitel tushit pojar");
            }
            void uchit() {
                System.out.println("Uchit");
            }
        }

        class Driver extends Employee implements Help_able,Swim_able {
            // если имплементим неск интерфейсов, пишем через запятую
            String nazvanieMachini;
            public void pomosh () {// не забываем дописывать паблик
                System.out.println("driver okazyvaet pomosh");
            }
            public void tushitpojar() {
                System.out.println("driver tushit pojar");
            }
            public void swim () {
                System.out.println("driver plavaet");}
            void vodit() {
                System.out.println("Vodit");
            }
        }

    }
//интерфейс может содержать только абстратные методы, тело писать нельзя
// можно написать abstract перед методом, можно нет, в любом случае Java сделает это самостоятельно
    interface Help_able {
    abstract void pomosh ();// abstract - излишний для интерфейса
    void tushitpojar();
    }

interface Swim_able {
    void swim ();
}


