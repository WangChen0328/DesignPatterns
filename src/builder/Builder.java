package builder;

/**
 * @author wangchen
 * @date 2018/5/16 9:07
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}