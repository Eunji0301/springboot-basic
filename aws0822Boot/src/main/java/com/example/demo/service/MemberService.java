package com.example.demo.service;

import com.example.demo.domain.MemberRequestDto;

public interface MemberService {
	public Long memberInsert(MemberRequestDto memberRequestDto);
}