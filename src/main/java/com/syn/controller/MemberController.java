package com.syn.controller;

import com.syn.domain.Member;
import com.syn.service.MemberService;
import com.syn.dto.MemberSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    /*@GetMapping(value = "/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Member getMember(@PathVariable("id") int id) {
        return mapper.getMember(id);
    }
*/

    @GetMapping("/users")
    public List<Member> getMemberList() {
        return memberService.getMemberList();
    }

    @PostMapping("/user")
    public Object insertMember(@RequestBody MemberSaveRequestDto requestDto) {
        System.out.println("requestDto = " + requestDto);
        return memberService.insert(requestDto);
    }

    /*@PostMapping("/user/{id}")
    public void postMember(@PathVariable("id") int id,
                           @RequestBody String pw, @RequestBody String name, @RequestBody String phone, @RequestBody String mail) {
        mapper.updateMember(id, pw, name, phone, mail);
    }*/

  /*  @DeleteMapping("/user/{id}")
    public void deleteMember(@PathVariable("id") int id) {
        mapper.deleteMember(id);
    }*/
}
