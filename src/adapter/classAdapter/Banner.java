package adapter.classAdapter;

/**
 * @author wangchen
 * @date 2018/5/9 13:41
 *
 * 被适配者，Adapt-er，既有方法的角色
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
