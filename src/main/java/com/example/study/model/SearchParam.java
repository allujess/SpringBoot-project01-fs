package com.example.study.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든 매개변수를 가지는 생성자가 추가됨
//자바코드를 줄여줌으로 생산성을 높여서 롬복을 많이 사용함
public class SearchParam {

    private String account;
    private String email;
    private int page;


}
