package Proxy;

/**
 * @author wangchen
 * @date 2018/5/25 16:09
 */
public class Printer implements Printable {

    private String name;

    public Printer() {
    }

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
    }

    @Override
    public String getPrinterName() {
        return null;
    }

    @Override
    public void print(String string) {

    }
}
