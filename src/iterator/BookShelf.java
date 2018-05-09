package iterator;

import java.util.List;

/**
 * @author wangchen
 * @date 2018/5/9 10:36
 */
public class BookShelf implements Aggregate {

    private List<Book> books;

    private int last;

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
