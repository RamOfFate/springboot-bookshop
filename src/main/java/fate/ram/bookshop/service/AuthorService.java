package fate.ram.bookshop.service;

import fate.ram.bookshop.model.Author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fate.ram.bookshop.repository.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author saveAuthor(Author author) {
        if (author.getName() == null || author.getName().isEmpty()) {
            throw new RuntimeException("Author name cannot be empty!");
        }
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
    
}
