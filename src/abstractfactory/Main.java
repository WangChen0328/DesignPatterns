package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * @author wangchen
 * @date 2018/5/16 15:29
 */
public class Main {

    public static void main(String[] args){

        Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory");

        Link link = factory.createLink("人民日报", "http://www.people.com.cn/");

        Tray tray = factory.createTray("日报");

        tray.add(link);

        Page page = factory.createPage("LinkPage", "作者");

        page.add(link);
        page.add(tray);

        page.output();
    }

}
