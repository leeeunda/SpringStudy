package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId=1L;
        Member member= new Member(memberId,"memberA", Grade.VIP );
        memberService.join(member); //회원을 생성해서 가입시킴 -> 메모리 객체에 넣어놓음

        Order order = orderService.createOrder(memberId, "itemA",10000);
        System.out.println("order = "+order);
        System.out.println("order.calculatePrice = "+ order.calculatePrice());
        //이러한 프린트 방식보다는 JUnit을 이용하기

    }
}
