package share.yours.ui;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import share.yours.domain.Member;
import share.yours.mapper.MemberMapper;

import java.util.List;

@RestController
public class MemberAction {

    private MemberMapper mapper;

    public MemberAction(MemberMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping(value = "/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Member getMember(@PathVariable("id") int id) {
        return mapper.getMember(id);
    }

    @GetMapping("/user/all")
    public List<Member> getMemberList() {
        return mapper.getMemberList();
    }

    @PutMapping("/user/{id}")
    public void putMember(@PathVariable("id") Integer id,
                          @RequestParam String name, @RequestParam String phone, @RequestParam String mail) {
        mapper.insertMember(id, name, phone, mail);
    }

    @PostMapping("/user/{id}")
    public void postMember(@PathVariable("id") int id, @RequestParam String name, @RequestParam String phone, @RequestParam String mail) {
        mapper.updateMember(id, name, phone, mail);
    }

    @DeleteMapping("/user/{id}")
    public void deleteMember(@PathVariable("id") int id) {
        mapper.deleteMember(id);
    }
}
