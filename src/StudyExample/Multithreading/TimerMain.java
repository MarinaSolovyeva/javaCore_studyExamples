package StudyExample.Multithreading;

import java.util.Timer;

public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Ex24_TimerTask(), 100, 3000);
    }
}
