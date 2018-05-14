package factory.idcard;

import factory.Factory;
import factory.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchen
 * @date 2018/5/14 14:11
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
}
