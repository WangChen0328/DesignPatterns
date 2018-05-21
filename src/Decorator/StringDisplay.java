package Decorator;

/**
 * @author wangchen
 * @date 2018/5/21 15:24
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }
}
