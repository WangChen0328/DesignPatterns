package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author wangchen
 * @date 2018/5/16 15:14
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            FileWriter writer = new FileWriter(title + ".html");
            writer.write(this.makeHTML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
