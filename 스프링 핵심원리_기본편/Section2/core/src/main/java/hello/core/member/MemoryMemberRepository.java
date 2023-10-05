package hello.core.member;
import java.util.HashMap;
import java.util.Map;

//db가 확정되지 않았으므로 메모리멤버 리파지토리를 이용. MemberRepository의 구현체
public class MemoryMemberRepository implements MemberRepository{
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

    private static Map<Long, Member> store = new HashMap<>(); //저장소 역할
    //concurrent 동시성 이슈가 있으므로 실무에서는 단순 HashMap이 아닌 concurrent hashmap을 사용해야 함.


}
