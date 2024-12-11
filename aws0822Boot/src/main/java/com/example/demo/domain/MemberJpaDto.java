package com.example.demo.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // DB table 컬럼 값 담는 용도
@Getter
@Table(name="member_tbl")
@NoArgsConstructor
@DynamicInsert // null인 값은 자동으로 insert 쿼리에 포함시키지 않겠다
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
	
	@CreationTimestamp
	private LocalDateTime writeday;
	
	@ColumnDefault("'N'")
	private String delYN;
	
	@Builder
	public MemberJpaDto(String memberId, String memberPw, String memberName, String memberEmail, String memberPhone, String memberAddress, String memberGender, String memberBirth, String memberHobby, String introduce) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberGender = memberGender;
		this.memberBirth = memberBirth;
		this.memberHobby = memberHobby;
		this.introduce = introduce;
	}
}