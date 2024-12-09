package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // DB table 컬럼 값 담는 용도
@Getter
@Table(name="member_tbl")
@NoArgsConstructor
public class MemberJpaDto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long midx;
	
	@Column(length=100,nullable=false)
	private String memberId;
	
	@Column(length=100,nullable=false)
	private String memberPw;
	
	@Column(length=100,nullable=false)
	private String memberName;
	
	@Column(length=100,nullable=true)
	private String memberEmail;
	
	@Column(length=100,nullable=true)
	private String memberPhone;
	
	@Column(length=100,nullable=true)
	private String memberAddress;
	
	@Column(length=1,nullable=true)
	private String memberGender;
	
	@Column(length=100,nullable=true)	
	private String memberBirth;
	
	@Column(length=100,nullable=true)
	private String memberHobby;
	
	@Column(columnDefinition="TEXT",nullable=true)
	private String introduce;
}
