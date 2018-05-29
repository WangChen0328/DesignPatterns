package state;

/**
 * @author wangchen
 * @date 2018/5/29 15:16
 */
public class SafeFrame implements Context {

    private State state = DayState.getInstance();

    @Override
    public void setClock(int hour) {
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {

    }

    @Override
    public void recordLog(String msg) {

    }
}
