package fate.ram.bookshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fate.ram.bookshop.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
} 