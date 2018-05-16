package abstractfactory.factory;

import java.util.ArrayList;

/**
 * @author wangchen
 * @date 2018/5/16 15:11
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
