package hello.core.member;

public interface MemberRepository {
    void save(Member member); //회원을 저장

    Member findById(Long memberId); //회원의 아이디로 회원을 찾는 기능
}

//인터페이스에 대한 구현체가 필요. 인터페이스와 구현체를 다른 패키지에 두는 것이 좋은 설계, 이번에는 같은 패키지로