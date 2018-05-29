package state;

/**
 * @author wangchen
 * @date 2018/5/24 15:03
 * 管理状态，联系警报中心
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
