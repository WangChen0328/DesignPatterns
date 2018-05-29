package state;

/**
 * @author wangchen
 * @date 2018/5/24 15:02
 * 每种状态下，不同的业务操作
 */
public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
