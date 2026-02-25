package fate.ram.bookshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fate.ram.bookshop.model.Author;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {
}
