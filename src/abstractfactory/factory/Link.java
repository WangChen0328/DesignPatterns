package abstractfactory.factory;

/**
 * @author wangchen
 * @date 2018/5/16 15:10
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
