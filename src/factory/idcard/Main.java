package factory.idcard;

import factory.Factory;
import factory.Product;

/**
 * @author wangchen
 * @date 2018/5/14 14:15
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new IDCardFactory();

        Product 张三 = factory.create("张三");
        Product 李四 = factory.create("李四");
        Product 王五 = factory.create("王五");

        张三.use();
        李四.use();
        王五.use();
    }
}
