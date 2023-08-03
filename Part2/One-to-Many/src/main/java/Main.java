import entity.Author;
import entity.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

    Author author = new Author("A001", "Krishan", "Bandaragama", "0774512028");
    Book book = new Book("B001", "Madolduuwa", 1000.0, author);
    Book book2 = new Book("B002", "Madolduuwa", 1000.0, author);

    Session session = FactoryConfig.getInstance().getSession();
    Transaction transaction = session.beginTransaction();

    session.persist(book);
    session.persist(book2);
    session.persist(author);

    transaction.commit();
    session.close();
    }
}
