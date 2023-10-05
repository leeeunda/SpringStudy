package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService= new MemberServiceImpl();
    @Test
    void join() {

        //given => 이게 주어지면
        Member member= new Member(1L, "memberA", Grade.VIP);

        //when => 이렇게 하면
        memberService.join(member);
        Member findMember=memberService.findMember(1L);

        //then => 결과가 요렇다~ 검증해본다
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
