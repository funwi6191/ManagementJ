
package book.library.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity

public class borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private book book;

    @ManyToOne
    private member member;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    private borrowStatus status; // BORROWED, RETURNED, OVERDUE

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public book getBook() {
        return book;
    }

    public void setBook(book book) {
        this.book = book;
    }

    public member getMember() {
        return member;
    }

    public void setMember(member member) {
        this.member = member;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public borrowStatus getStatus() {
        return status;
    }

    public void setStatus(borrowStatus status) {
        this.status = status;
    }

}
