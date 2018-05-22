package chainOfResponsibility;

/**
 * @author wangchen
 * @date 2018/5/22 15:04
 */
public class LimitSupport extends Support {

    public LimitSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < 100) {
            return true;
        } else {
            return false;
        }
    }
}
