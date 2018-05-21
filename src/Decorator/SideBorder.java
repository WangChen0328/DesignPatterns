package Decorator;

/**
 * @author wangchen
 * @date 2018/5/21 15:33
 */
public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }
}
