package visitor;

/**
 * @author wangchen
 * @date 2018/5/22 13:40
 * 标记接口
 */
public interface Element {
    void accept(Visitor visitor);
}
