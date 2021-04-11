package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    // 서비스를 만드려면 일단 회원 리포지토리가 있어야겠죠?
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /**
     * 회원 가입
     * 단, 같은 이름의 회원이 있으면 안된다.
     */
    public Long join(Member member){

        //같은 이름이 있는 중복 회원 X
        /** #1
         * Optional<Member> result = memberRepository.findByName(member.getName());
         *         //memberRepository.findByName(member.getName()) 작성 후
         *         //command+option+v 누르면 자동으로 Optional 위처럼 붙여줌 -> 최애 단축키 >,^
         *
         *         result.ifPresent(m -> {
         *             throw new IllegalStateException("이미 존재하는 회원입니다.");
         *         })
         *         요로케도 가능하지만 옵셔널을 반환하는게 예뻐보이지가 않아요...좀 더 간단히 적어보면,
         */

        //#2 깔끔하게 적은걸 메서드로 빼면 더~~~~좋지요~
        //단축키는 컨트롤+T
        validateDuplicatedMember(member);   //중복 회원 검증
        memberRepository.save(member);      //통과하면 저장하는구나~
        return member.getId();
    }

    private void validateDuplicatedMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById((memberId));
    }

    //이제 테스트 해볼까요? 클래스 명을 클릭하고 Command+shift+T > Create Test!
}
