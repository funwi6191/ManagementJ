
package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import book.library.entities.member;

public interface MemberRepository extends JpaRepository<member, Long> {
     member findByEmail(String email);

}
