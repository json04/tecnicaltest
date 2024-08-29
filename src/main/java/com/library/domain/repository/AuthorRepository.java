package com.library.domain.repository;

import com.library.domain.model.Author;
import java.util.Optional;

public interface AuthorRepository {

    Optional<Author> findById(Long id);
    Author save(Author author);
    void deleteById(Long id);
}
