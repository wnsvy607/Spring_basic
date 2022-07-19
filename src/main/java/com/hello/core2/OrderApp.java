package com.hello.core2;

import com.hello.core2.member.Grade;
import com.hello.core2.member.Member;
import com.hello.core2.member.MemberService;
import com.hello.core2.member.MemberServiceImpl;
import com.hello.core2.order.Order;
import com.hello.core2.order.OrderService;
import com.hello.core2.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();


        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
