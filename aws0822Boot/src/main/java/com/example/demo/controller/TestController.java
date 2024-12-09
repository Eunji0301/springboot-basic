package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.TestVo;

@Controller
public class TestController {
	@GetMapping(value="/test")
	public String test(Model model) {
		ArrayList<TestVo> alist = new ArrayList<TestVo>();
		
		TestVo tv = new TestVo();
		tv.setName("홍길동");
		tv.setMemberid("hong");
		alist.add(tv);
		
		TestVo tv2 = new TestVo();
		tv2.setName("이순신");
		tv2.setMemberid("lee");
		alist.add(tv2);
		
		TestVo tv3 = new TestVo();
		tv3.setName("강감찬");
		tv3.setMemberid("kang");
		alist.add(tv3);

		
		model.addAttribute("alist",alist);
		model.addAttribute("value","안녕하냐고요?");
		return "test";
	}
}
