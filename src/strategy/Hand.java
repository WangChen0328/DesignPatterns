package strategy;

/**
 * @author wangchen
 * @date 2018/5/17 15:10
 */
public class Hand {
    public static final int HANDVALUE_GUU = 0; //石头
    public static final int HANDVALUE_CHO = 1; //剪刀
    public static final int HANDVALUE_PAA = 2; //布

    public static final Hand[] hand = {
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = {"石头", "剪刀", "布"};

    private int handvalue;

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return name[handvalue];
    }
}
