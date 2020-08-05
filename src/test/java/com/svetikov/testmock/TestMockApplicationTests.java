package com.svetikov.testmock;

import com.svetikov.testmock.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestMockApplicationTests {
    @Autowired
    private TestController controller;
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

//    @Test
//    void contextLoads() {
//        assertThat(controller).isNotNull();
//    }

    @Test
    public void greetTest() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:"+port+"/",
                String.class)).contains("Hello , World");
    }

}
