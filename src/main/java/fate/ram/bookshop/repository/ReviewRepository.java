package fate.ram.bookshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fate.ram.bookshop.model.Review;

@Repository
public interface ReviewRepository  extends MongoRepository<Review, String> {
}

