
package book.library.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity

public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private LocalDate membershipDate;

    @Enumerated(EnumType.STRING)
    private role role; // LIBRARIAN or MEMBER

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }

    public role getRole() {
        return role;
    }

    public void setRole(role role) {
        this.role = role;
    }

}
