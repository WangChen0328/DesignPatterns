package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchen
 * @date 2018/5/23 15:18
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();
}
