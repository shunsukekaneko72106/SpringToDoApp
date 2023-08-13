package com.example.springtodoapp.app.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    
    @GetMapping
    public String showTestPage() {
        System.out.println("テストメソッドが呼ばれました。");
        return "testView";
    }
}