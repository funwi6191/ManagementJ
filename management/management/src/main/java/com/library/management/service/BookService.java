
package com.library.management.service;

import com.library.management.repository.BookRepository;

import book.library.entities.book;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<book> getAllBooks() {
        return bookRepository.findAll();
    }

    public book addBook(book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}


