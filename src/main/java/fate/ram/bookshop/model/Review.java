package fate.ram.bookshop.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


@Data
@Document(collection = "review")
public class Review {
    @Id
    private String id;

    private String reviewerName;
    private float rating;
    private String comment;

    @DocumentReference
    private Book book;
}
