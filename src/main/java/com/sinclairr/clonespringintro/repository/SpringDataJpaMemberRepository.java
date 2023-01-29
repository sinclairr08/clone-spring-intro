package com.sinclairr.clonespringintro.repository;

import com.sinclairr.clonespringintro.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long> , MemberRepository{
    @Override
    Optional<Member> findByName(String name);
}
