package prototype;

import java.util.HashMap;

/**
 * @author wangchen
 * @date 2018/5/15 13:37
 */
public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product product = showcase.get(protoname);
        /**
         * 根据实例来生成实例
         */
        return product.createClone();
    }
}
