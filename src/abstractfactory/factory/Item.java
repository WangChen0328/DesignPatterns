package abstractfactory.factory;

/**
 * @author wangchen
 * @date 2018/5/16 15:09
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
