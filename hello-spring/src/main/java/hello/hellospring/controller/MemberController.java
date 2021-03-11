package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    /**
     private final MemberService memberService = new MemberService();
     //-> 다른 곳에서도 멤버 서비스를 사용하는데,
     //   별다른 중요한 기능 없어서 여러개 만들 필요 없이 그냥 공유하면 돼서
     //   이렇게 선언하는 것이 비효율적!
     */
    //그럼 어떡해? -> 스프링 컨테이너에 등록하고 써!
    private final MemberService memberService;

    @Autowired  //스프링 컨테이너가 멤버 컨트롤러 생성할 때 어짜피 생성자를 호출하는데, 오토와이어드가 붙어있으면 딱 연결해줌!
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @GetMapping("/members/new") //just 이동
    public String createForm(){
        return "members/createMemberForm";
    }


    @PostMapping("/members/new") //데이터를 폼에 넣어서 전달받음.
    public String create(MemberForm form){
        Member member=new Member();
        member.setName(form.getName());

        //for test
        //System.out.println("member = "+member.getName());

        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        //members.forEach(s->System.out.println(s));
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
