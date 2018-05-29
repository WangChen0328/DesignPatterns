package state;

/**
 * @author wangchen
 * @date 2018/5/29 15:14
 */
public class NightState implements State {

    private static NightState singleton = new NightState();

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && 17 < hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("晚上");
    }

    @Override
    public void doAlarm(Context context) {

    }

    @Override
    public void doPhone(Context context) {

    }
}
