package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor // 기본생성자 생성
public class MemberRequestDto {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private String memberGender;
	private String memberBirth;
	private String memberHobby;
	
	@Builder // Builder를 통한 생성
	public MemberRequestDto(String memberId, String memberPw, String memberName, String memberEmail, String memberPhone, String memberAddress, String memberGender, String memberBirth, String memberHobby) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberGender = memberGender;
		this.memberBirth = memberBirth;
		this.memberHobby = memberHobby;
	}
}
