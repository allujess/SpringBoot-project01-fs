package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
//
@Data //기본생성자와 get/set메소드
@AllArgsConstructor //모든 매개변수를 가진 생성자도 설정
////DB의 테이블과 동일하게 선언 upper
@Entity //=DB of Table
//@Table(name="user") //클래스의 이름과 테이블의 이름이 동일하면 굳이 선언하지 않아도 됨 //JPA자동으로 매칭해줌
public class User{

    @Id //식별자
    //어떤식으로 가져갈껀지 전략 설정 MySQL-IDENTITY전략옵션을 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //BIGINTs
//    @Column(name="account") //name이 db컬럼을 뜻함 (똑같다면 선언하지 않아도 자으로 매핑)
    private String account;
    private String email;
    private String phoneNumber;
    private LocalDateTime createAt; //DATETIME
    private String createdBy;
    private LocalDateTime updateAt; //DATETIME
    private String updateBy;

    public User(){

    }


}
