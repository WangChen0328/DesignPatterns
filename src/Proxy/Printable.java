package Proxy;

/**
 * @author wangchen
 * @date 2018/5/25 16:06
 */
public interface Printable {
    /**
     * 设置名字
     * @param name
     */
    void setPrinterName(String name);

    /**
     * 获取名字
     * @return
     */
    String getPrinterName();

    /**
     * 显示文字，打印输出
     * @param string
     */
    void print(String string);
}
