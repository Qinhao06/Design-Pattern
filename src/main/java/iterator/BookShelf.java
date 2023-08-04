package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterator {

    List<Book> books = new ArrayList<>();

    int bookIndex = 0;

    public BookShelf(List<Book> books) {
        this.books = books;
    }

    public BookShelf() {
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public boolean hasNext() {
        return bookIndex < books.size();
    }



    @Override
    public Object next() {
        return books.get(bookIndex++);
    }

    public Iterator iterator() {
        return this;
    }
}
