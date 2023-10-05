package hello.core.member;

//멤버 서비스 implement의 구현체 -> 회원 가입과 조회를 위해서 어떤 것이 필요할까? => 멤버 레파지토리 인터페이스가 필요
public class MemberServiceImpl implements MemberService {

    //오른쪽 부분 -> 실제 할당하는 부분이 구현체를 의존 (추상화, 구체화 둘 다에 의존) => DIP 위반
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //단순히 인터페이스만 적으면 null point exception 발생 -> 구현 객체 선택(MemoryMemberRepository)
    @Override
    public void join(Member member) {
        memberRepository.save(member); //다형성에 의해 memberRepository의 save가 호출됨
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
