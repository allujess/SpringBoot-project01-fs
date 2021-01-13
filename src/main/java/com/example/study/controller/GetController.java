package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;



@RestController //controller인지 알려주는 지시자
@RequestMapping("/api") //localhost:8081/api
public class GetController {

    //사용자의 요청에대해서 받아들이는 메소드
    //맵핑을 통해서 메소드 타입과 path로 어떤 주소인지 설정을 해줌
    //localhost:8081/api/getMethod로 요청이 들어옴
    @RequestMapping(method = RequestMethod.GET, path ="/getMethod")
    public String getRequest(){

    //문자를 보여줄꺼
        return "안녕 겟메소드";

    }

    //jnit을 통해서 웹 ㅂ라우저를 통해서 보여줄수있지만 웹브라우저를 호출해서 직접 보여줄꺼얌

    //get에대해 처리여서 겟매빙을 함 메소드를 지정하지않고 주소만 지정해주면됨
    //localhost8081/api/getParameyer?id=1234&password=abcd
    //이렇게 파라미터를 받기위헤 RequestParam을 사용하여 해당값을 매칭하여 받아옴
    //

    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name = "password")String pwd){

        //지역내 변수에서 미리 비번사용 비추
        //name=password라고 알려줌 name을 지정하는 방법
        String password = "bbbb";

        //해당값을 받아옴
        System.out.println("id : "+ id);
        System.out.println("password   : "+ pwd);

        //묶어서 리턴
        return id+pwd;
    }

    // 여러가지 검색 파라미터를 받을때 !! -> //검색에 대한 변수가늘어나는 상황
    //requestParameter가 3개이상 4개이상 많아질 객체를 통해서 직접 받는 방

    @GetMapping("/getMultiParameter")

    public SearchParam getMultiParameter(SearchParam searchParam){

        //해당값들을 찍어봄
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getAccount());


    return searchParam;

        //netWork 통신을할때 json형식으로 통신을 함
        //{"account" : "", "email" : "", "page" : 0 }

        //json을 표준으로 사용해서 json으로 변환이되어서 자동으로 내려감
        //자동으로 변환됨 jackson라이브러리가 HTTP에서 json을 표준으로 사용해서
        //spring boot에서 내장으로 직접 jackson을 기본적으로 내장을 함
        //자동적으로 json이 변환이 되서 return 으로 함

    }


}
