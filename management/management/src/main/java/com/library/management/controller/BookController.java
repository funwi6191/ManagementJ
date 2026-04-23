
package com.library.management.controller;

import com.library.management.service.BookService;

import book.library.entities.book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")


public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public book addBook(@RequestBody book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

}
