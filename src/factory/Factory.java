package factory;

/**
 * @author wangchen
 * @date 2018/5/14 13:56
 */
public abstract class Factory {

    /**
     * Template Method 模式
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return  product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
