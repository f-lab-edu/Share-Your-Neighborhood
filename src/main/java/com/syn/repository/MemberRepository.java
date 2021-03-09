package com.syn.repository;

import com.syn.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberRepository {
    /**
     * data insert at members table
     *
     * @param member
     * @return 등록된 레코드 갯수
     */
    int insertMember(Member member);


    List<Member> selectMemberList();
};

