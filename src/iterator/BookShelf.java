package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchen
 * @date 2018/5/9 10:36
 */
public class BookShelf implements Aggregate {

    /**
     * 不管使用数组，List,Vector 只需要变更 书架类即可
     */
    private List<Book> books = new ArrayList<>();

    public void appendBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
