package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.domain.MemberJpaDto;
import com.example.demo.domain.MemberRequestDto;

public interface MemberService {
	public Long memberInsert(MemberRequestDto memberRequestDto);
	
	public MemberJpaDto memberIdCheck(String memberId);
	
	public ArrayList<MemberJpaDto> memberSelectAll();
}
