package iterator;

/**
 * @author wangchen
 * @date 2018/5/9 10:24
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
