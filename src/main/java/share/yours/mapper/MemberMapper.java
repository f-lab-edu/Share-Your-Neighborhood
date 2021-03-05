package share.yours.mapper;

import org.apache.ibatis.annotations.*;
import share.yours.domain.Member;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM MEMBERS WHERE id = #{id}")
    Member getMember(@Param("id") int id);

    @Select("SELECT * FROM MEMBERS")
    List<Member> getMemberList();

    @Insert("INSERT INTO MEMBERS VALUES(#{id}, #{name}, #{phone}, #{mail})")
    int insertMember(@Param("id") Integer id, @Param("name") String name,@Param("phone") String phone, @Param("mail") String mail );

    @Update("UPDATE MEMBERS SET id=#{id}, name=#{name}, phone=#{phone}, mail=#{mail} WHERE id=#{id}")
    int updateMember(@Param("id") Integer id, @Param("name") String name,@Param("phone") String phone, @Param("mail") String mail);

    @Delete("DELETE FROM MEMBERS Where id=#{id}")
    int deleteMember(@Param("id") Integer id);
}

