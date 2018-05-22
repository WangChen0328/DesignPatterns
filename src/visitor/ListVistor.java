package visitor;

import composite.Directory;
import composite.Entry;
import composite.File;

import java.util.Iterator;

/**
 * @author wangchen
 * @date 2018/5/22 13:45
 */
public class ListVistor extends Visitor {

    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }

}
