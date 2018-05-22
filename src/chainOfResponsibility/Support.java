package chainOfResponsibility;

/**
 * @author wangchen
 * @date 2018/5/22 14:52
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public void setNext(Support next) {
        this.next = next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            System.out.println("下一个");
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                ", next=" + next +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println("解决");
    }

    protected void fail(Trouble trouble) {
        System.out.println("未解决");
    }
}
