package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

//    // test1 접속했을때 test1실행
    @GetMapping("/test1")
    public String test1(){
        return "test1";
    }

    // test2 접속했을때 sub/test2 실행
    @GetMapping("/sub/test2")
    public String test2(){
        return "sub/test2";
    }
}
