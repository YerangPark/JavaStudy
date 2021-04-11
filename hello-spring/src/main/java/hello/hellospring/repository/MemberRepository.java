package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);             //회원이 저장소에 저장
    Optional<Member> findById(Long id);     //복잡한 조건문 없이 null을 처리하는 방법 중 하나. Optional로 감싼다고 한다.
    Optional<Member> findByName(String name);//이름으로 회원 찾기
    List<Member> findAll(); //리스트 전체 가져오기
    void clearStore();
    //이것들의 구현체는 Class에!
}
