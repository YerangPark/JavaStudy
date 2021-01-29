package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    //null을 관리하는 방법 중 하나. Optional
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll(); //리스트 전체 가져오기

}
