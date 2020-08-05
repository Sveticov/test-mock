package com.svetikov.testmock.controller;

import com.svetikov.testmock.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public @ResponseBody
    String seyHello(){
        return testService.greet();
    }
}
