package hello.core.order;


import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

//단일 책임 원칙을 잘 지킨 방식 할인에 대한 변경이 필요하면 주문쪽 코드를 고칠 필요가x
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member=memberRepository.findById(memberId); //회원정보 조회
        int discountPrice=discountPolicy.discount(member, itemPrice); //할인정책에 회원 정보를 넘김 그리고 최종적으로 할인된 가격을 반환

        return new Order(memberId, itemName, itemPrice, discountPrice); //최종 생성된 주문 정보를 넘긴다
    }
}
