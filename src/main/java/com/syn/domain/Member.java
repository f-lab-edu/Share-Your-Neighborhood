package com.syn.domain;

import lombok.*;

@NoArgsConstructor
@Getter
public class Member {
    private Integer id;
    private String pw;
    private String name;
    private String phone;
    private String mail;

    @Builder
    public Member(Integer id, String pw, String name, String phone, String mail) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }
}
