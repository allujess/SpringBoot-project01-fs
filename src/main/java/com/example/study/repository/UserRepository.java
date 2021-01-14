package com.example.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//JPArepository를 상속받음
//2가지 타입이있음 어떤type 의 object class와 pk의 타입
//<,> 어떠한 Type인지 제네릭으로 넘기고 , PK의 대해서 어떠한 타입인지 선언
//User라는 엔티티와 Long은 id값을 long로해서 인덱스를 선언
//이제 기본적인 CRUD를 할 수 있음
public interface UserRepository <User, Long>{

}
