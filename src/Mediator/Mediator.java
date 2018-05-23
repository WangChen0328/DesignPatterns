package Mediator;

/**
 * @author wangchen
 * @date 2018/5/23 14:32
 */
public interface Mediator {
    /**
     * 生成组员
     */
    void createColleagues();

    /**
     * 当组员发生改变是，通知仲裁者
     */
    void colleagueChanged();
}
