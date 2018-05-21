package Decorator;

/**
 * @author wangchen
 * @date 2018/5/21 15:30
 */
public abstract class Border extends Display {
    /**
     * 被包装或其他包装
     */
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
