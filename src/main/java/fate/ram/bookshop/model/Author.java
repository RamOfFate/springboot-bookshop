package fate.ram.bookshop.model;

import java.util.List;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "author")
public class Author {
    @Id
    private String id;

    private String name;
    private String biography;
    private String portraitUrl;

}
