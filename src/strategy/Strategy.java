package strategy;

/**
 * @author wangchen
 * @date 2018/5/17 15:22
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
