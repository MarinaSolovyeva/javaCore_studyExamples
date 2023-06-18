package StudyExample.Multithreading.Methods;

public class Ex5_Priority_Name {
    public static void main(String[] args) {
        Ex5_Priority_Name_MyThread5 thread5 = new Ex5_Priority_Name_MyThread5();
        System.out.println("Name of MyThread5 " +thread5.getName()); //Thread-0
        thread5.setName("MyThread 5"); //MyThread 5
        System.out.println("New name of MyThread5 " +thread5.getName());
        System.out.println("Priority of MyThread5 " + thread5.getPriority()); //5
        thread5.setPriority(9); //9
        System.out.println("New Priority of MyThread5 " + thread5.getPriority()); //9
        //когда устанавливаем приоритет, можем использовать как цифры, так и готовые варианты
        //thread5.setPriority(Thread.MAX_PRIORITY); //в списке enum : макс, мин,средн






        Ex5_Priority_Name_MyThread5 thread6 = new Ex5_Priority_Name_MyThread5();
        System.out.println("Name of MyThread6 " +thread6.getName()); //Thread-1
        System.out.println("Priority of MyThread6 " + thread6.getPriority()); //6

        /*
        если сами не назовем тред, у него дефолтное имя Thread 0 , Thread 1 и тд
        дефолтный приоритет - наивысший 10, по умолчанию 5, приоритет тоже можем изменить но нет
        никаких гарантий что он запустится быстрее
*/
    }
}
class Ex5_Priority_Name_MyThread5 extends Thread{
    @Override
    public void run() {

        System.out.println("Privet");

    }
}

