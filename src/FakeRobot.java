import scheduling.BackgroundAction;
import scheduling.Scheduler;

import java.util.Date;

import static util.Utils.*;

public class FakeRobot {
    public static void main(String[] args){
        BackgroundAction timeLogger = new BackgroundAction("TimeLogger", null) {
            @Override
            public boolean loop() {
                System.out.println(new Date().toString());
                return false;
            }
        };

       /* new BackgroundAction("ZombieMake", null){
            @Override
            public boolean loop() {
                //new
                return false;
            }
        };
        */
        while (true){
            Scheduler.get().loop();
            sleep(50);
        }
    }
}
