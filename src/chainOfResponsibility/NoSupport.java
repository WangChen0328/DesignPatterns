package chainOfResponsibility;

/**
 * @author wangchen
 * @date 2018/5/22 15:04
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
