package composite;

import visitor.Visitor;

/**
 * @author wangchen
 * @date 2018/5/21 14:30
 */
public class File extends Entry {

    private String name;

    private int Size;

    public File(String name, int size) {
        this.name = name;
        Size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.Size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
