package fate.ram.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fate.ram.bookshop.model.Review;
import fate.ram.bookshop.repository.ReviewRepository;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review saveReview(Review review) {
        if (review.getComment() == null || review.getComment().isEmpty()) {
            throw new RuntimeException("Review comment cannot be empty!");
        }
        return reviewRepository.save(review);
    }

    public void deleteReview(String id) {
        reviewRepository.deleteById(id);
    }
}
