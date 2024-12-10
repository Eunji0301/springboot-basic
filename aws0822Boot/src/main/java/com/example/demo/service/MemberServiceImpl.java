package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.MemberRequestDto;
import com.example.demo.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 생성자를 생성시키고 선택적 주입을 한다.
public class MemberServiceImpl implements MemberService{
	private final MemberRepository memberRepository;
	
	@Override
	public Long memberInsert(MemberRequestDto memberRequestDto) {
		System.out.println("넘어온 memberId값 : " + memberRequestDto.getMemberId());
		Long midx = memberRepository.save(memberRequestDto.toEntity()).getMidx();
		return midx;
	}

}