package visitor;

import composite.Directory;
import composite.File;

/**
 * @author wangchen
 * @date 2018/5/22 13:38
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
