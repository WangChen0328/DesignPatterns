package decorator;

/**
 * @author wangchen
 * @date 2018/5/21 15:36
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }

    @Override
    public int getColumns() {
        return 0;
    }
}
