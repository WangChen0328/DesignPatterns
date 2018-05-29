package strategy;

import java.util.Random;

/**
 * @author wangchen
 * @date 2018/5/17 15:25
 */
public class WinningStrategy implements Strategy {

    private Random random;

    private boolean won = false;

    private Hand prevhand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevhand = Hand.getHand(random.nextInt(3));
        }
        return prevhand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
