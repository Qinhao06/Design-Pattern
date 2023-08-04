package iterator;

import java.util.Iterator;

public class BookShelfIterator {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Around the World in 80 Days"));
        bookShelf.addBook(new Book("Bible"));
        bookShelf.addBook(new Book("Cinderella"));
        bookShelf.addBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            System.out.println(((Book)it.next()).getName());
        }

    }
}
