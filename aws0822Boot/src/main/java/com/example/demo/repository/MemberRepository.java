package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MemberJpaDto;

// Mybatis Mapper와 같다.(Dao)
// JpaRepository<Entity 클래스,PK타입>을 상속하면 자동으로
// CRUD(Create, Read, Update, Delete) 메서드가 내부에서 자동으로 생긴다.
@Repository
public interface MemberRepository extends JpaRepository<MemberJpaDto,Integer>{
	
}
