
package com.library.management.service;

import com.library.management.repository.MemberRepository;

import book.library.entities.member;

import org.springframework.stereotype.Service;

@Service

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public member registerMember(member member) {
        return memberRepository.save(member);
    }

    public member findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

}
