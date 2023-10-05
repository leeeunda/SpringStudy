package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;


public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP); //Long type이라 L 붙여줘야 됨
        memberService.join(member); //id가 1, 이름이 memberA인 멤버의 회원가입 실제 동작

        Member findMember = memberService.findMember(1L); //가입 멤버와 findMember가 일치하면 제대로 동작한 것
        System.out.println("member = " + member.getName()); //이름을 출력해서 확인
        System.out.println("fineMember = " + findMember.getName());
    }
}
