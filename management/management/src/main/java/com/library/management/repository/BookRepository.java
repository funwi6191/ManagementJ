
package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import book.library.entities.book;

import java.util.List;

public interface BookRepository extends JpaRepository<book, Long> {
    // Custom query methods
    List<book> findByTitleContaining(String title);
    List<book> findByAuthor(String author);

}
