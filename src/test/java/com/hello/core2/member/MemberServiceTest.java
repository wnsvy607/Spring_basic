package com.hello.core2.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        // org.assertj.core.api.Assertions 사용할 것 <- 검증하는데 편리한 패키지
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
