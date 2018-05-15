package prototype;

/**
 * @author wangchen
 * @date 2018/5/15 14:02
 */
public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();

        /**
         * 当生成的实例，改变其属性，已经影响到 实例本身的运行状态时，
         * 必须生成新的实例
         */
        MessageBox mbox = new MessageBox('*');
        /**
         * 也可以使用两个类来解决问题，
         * 如果类数量巨大，多例模式，更好解决
         */
        MessageBox sbox = new MessageBox('/');

        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product product = manager.create("warning box");
        Product product1 = manager.create("slash box");

        product.use("hello");
        product1.use("hello");

    }
}
