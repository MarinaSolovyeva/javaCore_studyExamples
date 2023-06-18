package StudyExample.Multithreading;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Ex24_TimerTask extends TimerTask {
        private static int i;
        @Override
        public void run() {
            System.out.print(++i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\t" + i);
        }
    }

