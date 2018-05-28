package Command;

import java.awt.*;

/**
 * @author wangchen
 * @date 2018/5/28 10:35
 */
public class DrawCanvas extends Canvas implements Drawable {

    private MacroCommand history;

    public DrawCanvas(MacroCommand history) {
        this.history = history;
    }

    @Override
    public void draw(int x, int y) {

    }

    /**
     * 重绘
     */
    public void print() {
        history.execute();
    }
}
