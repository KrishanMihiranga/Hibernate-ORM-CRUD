import entity.Author;
import entity.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Author author = new Author("A001", "Krishan", "Bandaragama", "0774512028");
    Author author2 = new Author("A002", "Kasun", "Panadura", "6342456789");

    Book book = new Book("B001", "Madolduuwa", 1000.0, author);
    Book book2 = new Book("B002", "Madolduuwa", 1000.0, author);
    Book book3 = new Book("B04", "Book3", 600.00, author2);
    Book book4 = new Book("B05", "Boo4", 2000.00, author2);

    Session session = FactoryConfig.getInstance().getSession();
    Transaction transaction = session.beginTransaction();
        List<Book> books1 = new ArrayList<>();
        books1.add(book);
        books1.add(book2);

        List<Book> books2 = new ArrayList<>();
        books2.add(book3);
        books2.add(book4);

        author.setBooks(books1);
        author2.setBooks(books2);

    session.persist(book);
    session.persist(book2);
    session.persist(book3);
    session.persist(book4);
    session.persist(author);
    session.persist(author2);

    transaction.commit();
    session.close();
    }
}
