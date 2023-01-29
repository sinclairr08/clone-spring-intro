package com.sinclairr.clonespringintro;

import com.sinclairr.clonespringintro.aop.TimeTraceAop;
import com.sinclairr.clonespringintro.repository.*;
import com.sinclairr.clonespringintro.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    //@Bean
    //public MemberRepository memberRepository()
    //{
        // return new MemoryMemberRepository(dataSource);
        // return new JdbcMemberRepository(dataSource);
        // return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);
    //}
}
