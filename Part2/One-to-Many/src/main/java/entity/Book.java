package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString
public class Book {

    @Id
    private String bookId;
    private String title;
    private Double price;

    @ManyToOne
    private Author authorId;

    public Book(String bookId, String title, Double price, Author AuthorId) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.authorId= AuthorId;
    }
}
