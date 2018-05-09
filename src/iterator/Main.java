package iterator;

/**
 * @author wangchen
 * @date 2018/5/9 11:00
 */
public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("A书"));
        bookShelf.appendBook(new Book("B书"));
        bookShelf.appendBook(new Book("C书"));
        bookShelf.appendBook(new Book("D书"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
