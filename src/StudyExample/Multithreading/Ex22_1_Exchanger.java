package StudyExample.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Ex22_1_Exchanger {
    //имитируем игру камень-ножницы-бумага
    public static void main(String[] args) {
        Exchanger <Action> exchanger = new Exchanger<>();
        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.NOJNIZY);
        friendAction.add(Action.BUMAGA);
        friendAction.add(Action.NOJNIZY);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new BestFriend("Marina", friendAction, exchanger);
        new BestFriend("Denis", friend2Action, exchanger);

    }
}

enum Action {
    KAMEN, NOJNIZY, BUMAGA;
}
class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger <Action> exchanger; //содержит Generics

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins (Action myAction, Action friendsAction) {
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNIZY)
                ||(myAction == Action.NOJNIZY && friendsAction == Action.BUMAGA)
                ||(myAction == Action.BUMAGA && friendsAction == Action.KAMEN))
        {
            System.out.println(name + " WINS!");
    }
}
public void run () {
        Action reply; // ответ друга, а метод exchange возвращает нам информацию полученную от второго потока
    //в параметре exchange мы передаем свою инфо, а в аутпуте инфо другого потока
    for (Action action:myActions) {
        try {
            reply = exchanger.exchange(action); // то есть в параметр добавляю свое действие, а получаю в результате
            //дейтвие другого потока
            whoWins(action, reply);
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}}

