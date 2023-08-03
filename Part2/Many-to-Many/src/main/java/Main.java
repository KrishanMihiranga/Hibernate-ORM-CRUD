import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("A0003", "Krishan", "Bandaragama", "0774512232" );
        Author author2 = new Author("A0004", "Kasun", "Panadura", "0774897532");

        Book book = new Book("B003", "Madolduuwa", 1000.0);
        Book book2 = new Book("B004", "Hathpana", 1500.0);


        List<Author> authors = new ArrayList<>();
        authors.add(author);
        authors.add(author2);
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        
        book.setAuthor(authors);
        book2.setAuthor(authors);
        
        author.setBooks(books);
        author2.setBooks(books);
        
        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book);
        session.persist(book2);
        session.persist(author);
        session.persist(author2);

        transaction.commit();
        session.close();

    }
}
