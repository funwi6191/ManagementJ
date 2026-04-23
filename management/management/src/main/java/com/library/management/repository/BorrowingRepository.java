
package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import book.library.entities.borrowStatus;

import java.util.List;

public interface BorrowingRepository  extends JpaRepository<borrowStatus, Long>{
    List<borrowStatus> findByMemberId(Long memberId);
    List<borrowStatus> findByBookId(Long bookId);

}
