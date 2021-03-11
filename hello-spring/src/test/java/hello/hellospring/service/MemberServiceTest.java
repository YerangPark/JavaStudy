package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    //회원가입을 하려면 서비스가 있어야 하니까 서비스부터 선
    MemberService memberService=new MemberService();

    @Test
    void 회원가입() {   //테스트는 과감히 한글로 이름 적어도 됨.
        //멤버부터 만들어야겠네~ 근데, 이번에는: 기븐/웬/덴 문법을 써보자!
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId=memberService.join(member);

        //then 검증 (with static import)
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    //잘 돌아가는 것도 중요하지만, 예외가 터지는 것을 확인하는 것도 중요하다.
    @Test
    public void 중복_회원_예외() {
        //given
        Member member1=new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        try{
            memberService.join(member2);    //예외 발생 (validateDuplicatedMember)
            fail();
        } catch (IllegalStateException e) {
            //예외가 터지면 정상적으로 성공한 것이니까 그냥 두기
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.123123"); //for checking
        }


        //then
    }

    @Test
    void findMembers() {
        //given

        //when

        //then

    }

    @Test
    void findOne() {

    }
}