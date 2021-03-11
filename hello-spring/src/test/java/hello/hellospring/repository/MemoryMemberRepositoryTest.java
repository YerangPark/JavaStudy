package hello.hellospring.repository;

import hello.hellospring.domain.Member;
//import org.junit.jupiter.api.Assertions;
import net.bytebuddy.build.ToStringPlugin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    // 각 기능마다 테스트 해볼거예요~
    MemoryMemberRepository repository = new MemoryMemberRepository();


    // findByName() 메서드와 findAll() 메서드에서 같은 이름으로 변수를 사용하기 때문에
    // 전체 구동 시 특정 순서에 의해 오류 발생함.
    // 테스트 끝날 때마다 항상 리포지토리 비워주도록 만들어야 함.
    // 잠깐 MemoryMemberRepository에 가서 clearStore() 만들고 온 후...

    @AfterEach  //각 메서드가 실행 될 때마다 실행!
    public void afterEach(){
        repository.clearStore();
    }
    // 이제 순서와 상관 없이 테스트가 실행될 수 있음.

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        //.get은 옵셔널에서 꺼내기 위해서 사
        Member result = repository.findById(member.getId()).get();
        //new해서 가져온 멤버의 Id와 겟해서 가져온 Id와 동일하면 참이겠죠?

        //간단한 방법
        //System.out.println("result = "+(result==member));

        //테스트 방법
        //Assertions.assertEquals(member, result);

        //요즘 테스트 방법
        //Assertions.assertThat(member).isEqualTo(result);
        //-> static import
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        //member1 테스트용으로 생성
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        //비교용 member2 생성. member1 복사한다음 ⇪+F6 하면 바로 이름 쫙 바뀜!
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);
        //이렇게 하면 가입 된거임.

        //get으로 안할거면 optional써야됨!
        Member result = repository.findByName("spring2").get();

        assertThat(result).isEqualTo(member2);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        //2개가 맞니? 물어봅시당~
        assertThat(result.size()).isEqualTo(2);
    }
}
