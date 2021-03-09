package com.syn.service;

import com.syn.dto.MemberSaveRequestDto;
import com.syn.domain.Member;
import com.syn.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private MemberRepository memberRepository;
    private PasswordEncoder passwordEncoder;

    public Integer insert(MemberSaveRequestDto requestDto) {
        final Member member = requestDto.toEntity();
        /*requestDto.encodingPassword(passwordEncoder.encode(member.getPw()));*/
        System.out.println("hi");
        System.out.println("member service member = " + requestDto);

        memberRepository.insertMember(member);
        return member.getId();
    }

    public List<Member> getMemberList() {
        memberRepository.selectMemberList();
        System.out.println("get member List 진입");
        return null;
    }
}
