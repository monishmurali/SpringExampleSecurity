package com.SpringSecurityproject2.SpringSecurity2;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("about")
    public String printAbout()
    {
        return "About Monish";
    }

    @GetMapping("Hello")

        public String printHello()
        {
            return "Hello Monish";
        }
    }

