package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //클래스의 주소가 겹치는 건 괜찮지만 메소드의 주소가 겹치면 실행되지 못함
public class PostController {

    //포스트는 HTML에 form 태그를 사용할때라던지
    //ajax에서 검색할때 사용이됨 -> 검색파라미터가 많다는 의미
    //HTTP통신을할때 body에 데이터를 집어넣어서 보내겠다라는 의미
    //json, xml, multiPart-form / text-plain 횽태를 지원함ㄷ

//    @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    //기본저그로 사용할 ㄷ형태는 json ->어떠한 방식으로 받을지 지정도 해야함
    //이 객체를 통해서 해당 요청을 받는다
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        return searchParam;
    }

    @PutMapping
    public void put(){

    }
    @PatchMapping
    public void patch(){

    }
}
