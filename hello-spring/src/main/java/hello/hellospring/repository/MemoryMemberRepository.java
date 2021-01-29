package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; //0, 1, 2 이렇게 키값을 생성해주는 아이

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // return store.get(id); -> 널 반환 가능성 있음.
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        //Java 8's Lambda
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
        //루프로 돌림.
        //파라미터로 넘어온 네임과 멤버의 네임이 같면 필터링.
        //찾으면 반환.
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void clearStore(){
        store.clear();
    }
}
