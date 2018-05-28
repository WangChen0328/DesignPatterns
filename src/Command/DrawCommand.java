package Command;

import java.awt.*;

/**
 * @author wangchen
 * @date 2018/5/28 10:30
 */
public class DrawCommand implements Command {

    protected Drawable drawable;

    protected Point point;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }

    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
