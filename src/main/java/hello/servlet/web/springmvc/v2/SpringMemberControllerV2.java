package hello.servlet.web.springmvc.v2;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/springmvc/v2/members")
public class SpringMemberControllerV2 {

    private MemberRepository repository = MemberRepository.getInstance();


    @GetMapping()
    public String members(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("members", repository.findAll());
        return "members";

    }

    @GetMapping("/new-form")
    public String memberForm() {
        return "new-form";
    }

    @PostMapping("/save")
    public String memberSave(Model model, @RequestParam("username") String username, @RequestParam("age") int age) {
        Member member = new Member(username,age);
        repository.save(member);
        model.addAttribute("member", member);
        return "save-result";
    }


}
