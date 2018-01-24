package com.strugglingCoder.springsecurityintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringSecurityIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityIntroApplication.class, args);
	}
}

@RestController
class HelloWorldController {
    @GetMapping(value ="/hello")
    public String helloWorld(){
        return "Hello";
    }

    @GetMapping(value="/admin/hello")
    public String adminHello(){
        return "Hello Admin";
    }

    @GetMapping(value = "/user/hello")
    public String userHello(){
        return "User hello!";
    }

    @GetMapping(value="/technician/hello")
    public String techHello(){
        return "Tech hello";
    }
}

