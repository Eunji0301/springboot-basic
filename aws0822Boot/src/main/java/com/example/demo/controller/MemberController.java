package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.MemberJpaDto;
import com.example.demo.domain.MemberRequestDto;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;


@Controller
@RequestMapping(value="/member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping(value="/memberSignin.aws")
	public String memberSignin() {
		return "memberSignin";
	}
	
	@PostMapping(value="/memberSigninAction.aws")
	public String memberSigninAction(@ModelAttribute MemberRequestDto memberRequestDto) {
		System.out.println("넘어온 memberId : " + memberRequestDto.getMemberId());
		// 서비스 호출 memberInsert() 메서드 불러서 값을 넣어 실행
		Long value = memberService.memberInsert(memberRequestDto);
		System.out.println("value : " + value);
		return "redirect:/";
	}
	
	@ResponseBody
	@PostMapping(value="memberIdCheck.aws")
	public String memberIdCheck(@RequestParam("memberId") String memberId) {
		MemberJpaDto mdto =  memberService.memberIdCheck(memberId);
		int cnt = 0;
		if(mdto == null) {
			cnt = 0;
		} else {
			cnt = 1;
		}
		
		String value = "{\"cnt\" : \""+cnt+"\"}";

		return value;
	}
}
