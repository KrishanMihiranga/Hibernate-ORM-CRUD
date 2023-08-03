package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {

    @Id
    private String authorId;
    private String name;
    private String address;
    private String contactNo;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author(String authorId, String name, String address, String contactNo) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }


}
