package com.library.infrastructure.repository;

import com.library.domain.model.Author;
import com.library.domain.repository.AuthorRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAuthorRepository extends JpaRepository<Author, Long>, AuthorRepository {

}
