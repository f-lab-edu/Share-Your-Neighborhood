package com.syn.dto;

import com.syn.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class MemberSaveRequestDto {
    private Integer id;
    private String pw;
    private String name;
    private String phone;
    private String mail;

    @Builder
    public MemberSaveRequestDto(Integer id, String pw, String name, String phone, String mail) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .pw(pw)
                .name(name)
                .phone(phone)
                .mail(mail)
                .build();
    }

    //시큐리티 비밀번호 암호화
    public void encodingPassword(String pw) {
        this.pw = pw;
    }
}
