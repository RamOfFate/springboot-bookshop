package fate.ram.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fate.ram.bookshop.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
} 