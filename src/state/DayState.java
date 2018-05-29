package state;

/**
 * @author wangchen
 * @date 2018/5/29 15:12
 */
public class DayState implements State {

    private static DayState singleton = new DayState();

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 > hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("白天");
    }

    @Override
    public void doAlarm(Context context) {

    }

    @Override
    public void doPhone(Context context) {

    }
}
