package composite;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wangchen
 * @date 2018/5/21 14:33
 */
public class Directory extends Entry {

    private String name;

    private ArrayList<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            size += next.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return entry;
    }

    public Iterator iterator() {
        return entries.iterator();
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            next.printList(prefix + "/" + this.name);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
