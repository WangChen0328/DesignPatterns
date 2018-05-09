package adapter.objectAdapter;

import adapter.classAdapter.Banner;

/**
 * @author wangchen
 * @date 2018/5/9 13:54
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    protected void printWeak() {
        banner.showWithParen();
    }

    @Override
    protected void printStrong() {
        banner.showWithAster();
    }
}
