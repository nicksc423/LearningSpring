package com.nicksc423;

import com.nicksc423.services.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by NickCollins on 2/1/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/helloworld-config.xml",
        "classpath*:/spring/english-hello-world.xml"})
public class EnglishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    public void testHelloWorld() {
        String expectedGreeting = "Hello World!!!";

        assertEquals(expectedGreeting, helloWorldService.getGreeting());
    }
}
