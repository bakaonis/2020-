import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
public abstract class CommonUtils {
	public static void task(long period, ITimer t) {
        java.util.Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //当结束开关打开时，清除所有定时器
                if (Constant.TIMER_STOP_ON_OFF) {
                    timer.cancel();
                    return;
                }
                t.run();
            }
        };
        timer.schedule(timerTask, 0, period);
    }
}
