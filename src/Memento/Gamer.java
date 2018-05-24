package Memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangchen
 * @date 2018/5/24 13:53
 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList<>();
    private static String[] fruitsName = {"苹果", "葡挞", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    /**
     * 每次返回新的快照，怎么使用，在第三方类使用。
     * @return
     */
    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            memento.addFruit(iterator.next());
        }
        return memento;
    }
}
