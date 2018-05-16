package builder;

/**
 * @author wangchen
 * @date 2018/5/16 9:14
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 由 Builder 加载复杂对象
     * 当前方法使用 Builder 子类的具体方法，类似 Template 模式
     *
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("");
        builder.close();
    }
}
