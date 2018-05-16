package abstractfactory.listfactory;

import abstractfactory.factory.Page;

/**
 * @author wangchen
 * @date 2018/5/16 15:47
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
