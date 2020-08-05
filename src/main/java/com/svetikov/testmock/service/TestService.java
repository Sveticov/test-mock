package com.svetikov.testmock.service;

import org.springframework.stereotype.Service;

@Service
public class TestService implements TestServiceInt{

    @Override
    public String greet() {
        return "Hello , World";
    }
}

interface TestServiceInt{
   String greet();
}