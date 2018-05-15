package prototype;

/**
 * @author wangchen
 * @date 2018/5/14 15:30
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
