import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("B0001", "Rendezvous with Rama", "Arthur");

        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //ADD
        session.persist(book);

        //fetch
        Book book1 = session.get(Book.class, "B0001");
        System.out.println(book1.getTitle());

        //update
        book.setAuthor("Arthur C. Clarke");
        session.update(book);

        //delete
        session.remove(book);


        transaction.commit();
        session.close();
    }
}
