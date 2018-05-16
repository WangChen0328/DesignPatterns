package abstractfactory.listfactory;

import abstractfactory.factory.Tray;

/**
 * @author wangchen
 * @date 2018/5/16 15:47
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
