
package com.library.management.controller;

import com.library.management.service.MemberService;

import book.library.entities.member;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")

public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public member registerMember(@RequestBody member member) {
        return memberService.registerMember(member);
    }

    @GetMapping("/email/{email}")
    public member getMemberByEmail(@PathVariable String email) {
        return memberService.findByEmail(email);
    }

}
