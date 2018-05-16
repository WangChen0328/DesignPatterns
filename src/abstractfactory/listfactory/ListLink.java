package abstractfactory.listfactory;

import abstractfactory.factory.Link;

/**
 * @author wangchen
 * @date 2018/5/16 15:45
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
