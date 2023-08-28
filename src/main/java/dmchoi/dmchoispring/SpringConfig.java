package dmchoi.dmchoispring;

import dmchoi.dmchoispring.repository.MemberRepository;
import dmchoi.dmchoispring.repository.MemoryMemberRepository;
import dmchoi.dmchoispring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService () {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
