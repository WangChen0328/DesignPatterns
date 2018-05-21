package Decorator;

/**
 * @author wangchen
 * @date 2018/5/21 15:04
 */
public abstract class Display {
    public abstract int getRows();
    public abstract String getRowText(int row);
    public abstract int getColumns();

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
