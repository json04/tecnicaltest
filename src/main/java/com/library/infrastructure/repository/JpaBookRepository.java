package com.library.infrastructure.repository;

import com.library.domain.model.Book;
import com.library.domain.repository.BookRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBookRepository extends JpaRepository<Book, Long>, BookRepository {
}
