
package com.library.management.controller;

import com.library.management.service.BorrowingService;

import book.library.entities.borrowStatus;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowings")

public class BorrowingController {
    private final BorrowingService borrowingService;

    public BorrowingController(BorrowingService borrowingService) {
        this.borrowingService = borrowingService;
    }

    @PostMapping
    public borrowStatus borrowBook(@RequestBody borrowStatus borrowing) {
        return borrowingService.borrowBook(borrowing);
    }

    @GetMapping("/member/{memberId}")
    public List<borrowStatus> getBorrowingsByMember(@PathVariable Long memberId) {
        return borrowingService.getBorrowingsByMember(memberId);
    }

    @GetMapping("/book/{bookId}")
    public List<borrowStatus> getBorrowingsByBook(@PathVariable Long bookId) {
        return borrowingService.getBorrowingsByBook(bookId);
    }

}
