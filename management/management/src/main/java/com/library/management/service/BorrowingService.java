
package com.library.management.service;

import com.library.management.repository.BorrowingRepository;

import book.library.entities.borrowStatus;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BorrowingService {
    private final BorrowingRepository borrowingRepository;

    public BorrowingService(BorrowingRepository borrowingRepository) {
        this.borrowingRepository = borrowingRepository;
    }

    public borrowStatus borrowBook(borrowStatus borrowing) {
        return borrowingRepository.save(borrowing);
    }

    public List<borrowStatus> getBorrowingsByMember(Long memberId) {
        return borrowingRepository.findByMemberId(memberId);
    }

    public List<borrowStatus> getBorrowingsByBook(Long bookId) {
        return borrowingRepository.findByBookId(bookId);
    }

}
