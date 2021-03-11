package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {
    //implements 한 후에 ⌥(option)+Enter 하면 implementMethod가 가능!
    //클릭하면 구현체 form 자동 생성됨.

    //저장하기 위한 자료구조
    private static Map<Long, Member> store = new HashMap<>();   //옵션 엔터로 import하기.
    //실무에서는 동시성 문제가 있어서 컨클루드 해시맵을 써야 하지만, 예제니까 단순하게 할게유~
    private static long sequence = 0L; //0, 1, 2 이렇게 키값을 생성해주는 아이
    //얘도 어텀 롱 이런걸로 해야되는데 일단 단순하게 할게유~

    @Override   //Override 어노테이션 : 메서드 선언에만 달 수 있고, 상위 클래스의 메서드를 재정의했음을 의미함.
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
        //(사전에 멤버에 아이디와 이름이 넘어온 상태)아이디 값 먼저 세팅해주고, store에 저장.
    }

    @Override
    public Optional<Member> findById(Long id) {
        //스토어에서 꺼내면 됨.
        // return store.get(id); -> But, 결과가 없을 때 널 반환 가능성 있음.
        //널 반환 가능성이 있을 땐 Optional로 감싸기!!!!
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        //Java 8's Lambda 여기서 내가 자바8 공부하러 빠졌구나...
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
        //맵에서 루프를 끝까지 돌면서
        //파라미터로 넘어온 name과 멤버의 name이 같으면 필터링.
        //하나라도 찾으면 반환.
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }


    public void clearStore() {
        store.clear();
    }

    //근데 얘네가 제대로 동작하는지 어떻게 볼 수 있을까? -> 테스트 케이스!!!
    //클래스 이름 클릭 후 Command+Shift+T
}
