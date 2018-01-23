package com.strugglingCoder.springsecurityintro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kini on 23-Jan-18.
 */
@RestController
public class HelloWorldRestController {

    @RequestMapping("/hello-world")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}