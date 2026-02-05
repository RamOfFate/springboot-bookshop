package fate.ram.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fate.ram.bookshop.model.Review;

@Repository
public interface ReviewRepository  extends JpaRepository<Review, Long> {
}

